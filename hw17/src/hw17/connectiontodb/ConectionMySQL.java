package hw17.connectiontodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionMySQL {
    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "videolybrary";
        String userName = "root";
        String password = "123123";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    private static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws SQLException,ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;
                Connection conect = DriverManager.getConnection(connectionURL, userName, password);
            return conect;
        }
    }

