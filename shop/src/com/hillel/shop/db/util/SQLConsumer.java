package com.hillel.shop.db.util;

import java.sql.SQLException;

public interface SQLConsumer<T> {

    void accept(T t) throws SQLException;

}
