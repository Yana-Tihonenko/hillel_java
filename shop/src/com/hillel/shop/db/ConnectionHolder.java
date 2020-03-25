package com.hillel.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHolder {
    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/shop";

        Properties prop = new Properties();
        prop.put("user", "admin");
        prop.put("password", "admin");
        prop.put("useSSL", "false");
        prop.put("serverTimezone", "UTC");
        prop.put("characterEncoding", "UTF-8");

        return DriverManager.getConnection(url, prop);
    }
}
