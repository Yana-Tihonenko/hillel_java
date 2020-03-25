package com.hillel.shop.entity;

public class OrderProduct extends Product {

    public static final String COUNT = "count";
    public static final String ORDER_ID = "order_id";
    public static final String PRODUCT_ID = "product_id";
    
    private int count;

    public OrderProduct(int id, int count) {
        this(id, "", "", 0, count);
    }

    public OrderProduct(int id, String name, String description, int price, int count) {
        super(id, name, description, price);
        this.count = count;
    }
    
    public OrderProduct(Product product, int count) {
        this(product.getId(), product.getName(), 
                product.getDescription(), product.getPrice(), count);
    }

    @Override
    public String toString() {
        return "OrderProduct [count=" + count + ", " + super.toString() + "]";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
