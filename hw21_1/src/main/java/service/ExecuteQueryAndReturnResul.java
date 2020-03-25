package service;

import connectiontodb.ConectionMySQL;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class ExecuteQueryAndReturnResul {
    public static ResultSet executeQueryWithoutParametr(String sql) {
        Connection con = null;
        Statement st = null;
        ResultSet resultSet = null;
        try {
            con = ConectionMySQL.getMySQLConnection();
            st = con.createStatement();
            resultSet = st.executeQuery(sql);
            return resultSet;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (SQLException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return resultSet = null;
        }
    }

    public static ResultSet executeQueryToParametr(String sql, int param) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet resultSet = null;
        try {
            con = ConectionMySQL.getMySQLConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, param);
            resultSet = st.executeQuery();
            return resultSet;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (SQLException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return resultSet = null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return resultSet = null;
        }
    }

    public static int UpdateQueryToParametr(String sql, int param) {
        Connection con = null;
        PreparedStatement st = null;
        int resultSet = 0;
        try {
            con = ConectionMySQL.getMySQLConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, param);
            resultSet = st.executeUpdate();
            return resultSet;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return resultSet;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return resultSet;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return resultSet;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return resultSet;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return resultSet;
        }
    }
}
