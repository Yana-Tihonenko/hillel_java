package com.hillel.shop.service;

import java.util.List;

import com.hillel.shop.entity.Order;

public interface Shop {

    Order findOrder(int orderId);

    List<Order> findBySumAndProductsCount(int sum, int productsCount);

    List<Order> findByProduct(int productId);

    List<Order> findByExcludedProductForToday(int productId);

    void createOrderWithTodayOrderedProducts();

    void deleteOrdersByProduct(int productId, int count);

}
