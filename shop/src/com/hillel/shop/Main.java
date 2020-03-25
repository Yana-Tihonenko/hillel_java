package com.hillel.shop;

import com.hillel.shop.service.Shop;
import com.hillel.shop.service.impl.DBShop;

public class Main {
    
    public static void main(String[] args) {
       Shop shop = new DBShop();
       System.out.println(shop.findOrder(1));
       shop.createOrderWithTodayOrderedProducts();
    }
    
}
