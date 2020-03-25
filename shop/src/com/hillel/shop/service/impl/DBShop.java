package com.hillel.shop.service.impl;

import java.util.List;

import com.hillel.shop.db.DBManager;
import com.hillel.shop.entity.Order;
import com.hillel.shop.service.Shop;

public class DBShop implements Shop {

    private DBManager manager;

    public DBShop() {
        manager = new DBManager();
    }

    @Override
    public Order findOrder(int orderId) {
        return getManager().findOrderById(orderId);
    }

    @Override
    public List<Order> findBySumAndProductsCount(int sum, int productsCount) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> findByProduct(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> findByExcludedProductForToday(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void createOrderWithTodayOrderedProducts() {
        getManager().createOrderWithTodayOrderedProducts();
    }

    @Override
    public void deleteOrdersByProduct(int productId, int count) {
        // TODO Auto-generated method stub

    }

    public DBManager getManager() {
        return manager;
    }

    public void setManager(DBManager manager) {
        this.manager = manager;
    }

}
