package com.hillel.shop.db.util;

import java.sql.SQLException;

public interface SQLFunction<T, R> {

    R apply(T t) throws SQLException;
}
