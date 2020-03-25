package com.hillel.shop.db;

import static java.util.Objects.nonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hillel.shop.db.util.SQLConsumer;
import com.hillel.shop.db.util.SQLFunction;
import com.hillel.shop.entity.Order;
import com.hillel.shop.entity.OrderProduct;
import com.hillel.shop.entity.Product;

public class DBManager {

    private static final String INSERT_PRODUCT_TO_ORDER_WITH_VALUES = "INSERT INTO shop.product_to_order (`order_id`, `product_id`, `count`) VALUES (?, ?, ?)";
    private static final String INSERT_EMPTY_ORDER = "insert into shop.order values()";
    private static final String SELECT_TODAY_ORDERED_PRODUCT_IDS = "SELECT DISTINCT product_to_order.product_id, sum(product_to_order.count) as 'count' "
                                                                 + "FROM product_to_order "
                                                                 + "WHERE product_to_order.order_id " 
                                                                     + "IN (SELECT id FROM shop.order WHERE DATE(date) = CURDATE())"
                                                                 + "GROUP BY product_to_order.product_id;";
    private static final String SELECT_PRODUCT_BY_ID = "SELECT * FROM product WHERE id=?";
    private static final String SELECT_ORDER_PRODUCTS = "SELECT * FROM product_to_order WHERE order_id=?";
    private static final String SELECT_ORDER_BY_ID = "SELECT * FROM shop.order WHERE id=?";

    public Order findOrderById(int orderId) {
        return performWithPreparedStatement(st -> {
            st.setInt(1, orderId);
            ResultSet res = st.executeQuery();
            if (res.next()) {
                return createOrderFromResultSet(res);
            }
            return null;
        }, SELECT_ORDER_BY_ID);
    }
    
    private Product findProductById(int productId) {
       return performWithPreparedStatement(st -> {
            st.setInt(1, productId);
            ResultSet res = st.executeQuery();
            if (res.next()) {
                return createProductFromResultSet(res);
            }
            return null;
        }, SELECT_PRODUCT_BY_ID);
    }

    public void createOrderWithTodayOrderedProducts() {
        performWithStatement(st -> {
            ResultSet res = st.executeQuery(SELECT_TODAY_ORDERED_PRODUCT_IDS);
            List<OrderProduct> orderProducts = new ArrayList<>();
            while (res.next()) {
                orderProducts.add(new OrderProduct(res.getInt(1), res.getInt(2)));
            }
            insertOrder(orderProducts);
        });
    }


    private List<OrderProduct> findOrderProducts(int orderId) {

        return performWithPreparedStatement(st -> {
            st.setInt(1, orderId);
            ResultSet res = st.executeQuery();
            List<OrderProduct> orderProducts = new ArrayList<>();
            while (res.next()) {
                int count = res.getInt(OrderProduct.COUNT);
                int productId = res.getInt(OrderProduct.PRODUCT_ID);
                Product product = findProductById(productId);
                orderProducts.add(new OrderProduct(product, count));
            }
            return orderProducts;
        }, SELECT_ORDER_PRODUCTS);
    }
    
    private <R> R performWithPreparedStatement(SQLFunction<PreparedStatement, R> function, String statementToPrepare) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = ConnectionHolder.getConnection();
            st = con.prepareStatement(statementToPrepare);
            return function.apply(st);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
        
        return null;
    }

    private void insertOrder(List<OrderProduct> products) {
        performWithStatement(st -> {
            int updateCount = st.executeUpdate(INSERT_EMPTY_ORDER, Statement.RETURN_GENERATED_KEYS);
            if (updateCount > 0) {
                ResultSet generatedKeys = st.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int createdOrderId = generatedKeys.getInt(1);
                    for (OrderProduct orderProduct : products) {
                        insertProductToOrder(createdOrderId, orderProduct.getId(), orderProduct.getCount());
                    }
                }
            }
        });
    }
    
    private void performWithStatement(SQLConsumer<Statement> consumer) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionHolder.getConnection();
            st = con.createStatement();
            consumer.accept(st);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
    }
    
    private void performWithPreparedStatement(SQLConsumer<PreparedStatement> consumer, String statementToPrepare) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = ConnectionHolder.getConnection();
            st = con.prepareStatement(statementToPrepare);
            consumer.accept(st);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
    }
    
    private void insertProductToOrder(int orderId, int productId, int count) {
        performWithPreparedStatement(st -> {
            st.setInt(1, orderId);
            st.setInt(2, productId);
            st.setInt(3, count);
            st.executeUpdate();
        }, INSERT_PRODUCT_TO_ORDER_WITH_VALUES);
    }

    private Product createProductFromResultSet(ResultSet res) throws SQLException {
        int id = res.getInt(Product.ID);
        int price = res.getInt(Product.PRICE);
        String name = res.getString(Product.NAME);
        String description = res.getString(Product.DESCRIPTION);
        return new Product(id, name, description, price);
    }

    private Order createOrderFromResultSet(ResultSet res) throws SQLException {
        int id = res.getInt(Order.ID);
        Date date = res.getDate(Order.DATE);
        List<OrderProduct> orderProducts = findOrderProducts(id);
        return new Order(id, date, orderProducts);
    }

    private void closeStatement(Statement st) {
        try {
            if (nonNull(st)) {
                st.close();
            }
        } catch (SQLException e) {
            System.err.println("Cannot close statement");
        }
    }

    private void closeConnection(Connection con) {
        try {
            if (nonNull(con)) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Cannot close connection");
        }
    }

}
