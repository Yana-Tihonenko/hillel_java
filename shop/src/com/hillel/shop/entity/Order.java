package com.hillel.shop.entity;

import java.util.Date;
import java.util.List;

public class Order extends Entity {

    public static final String DATE = "date";
    
    private Date date;
    private List<OrderProduct> products;

    public Order(int id, Date date, List<OrderProduct> products) {
        super(id);
        this.date = date;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order [date=" + date + ", products=" + products + "]";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }

}
