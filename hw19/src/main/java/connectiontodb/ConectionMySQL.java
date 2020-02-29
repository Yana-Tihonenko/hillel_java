package connectiontodb;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionMySQL {
    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String hostName = "localhost";
        String dbName = "videolybrary";
        String userName = "root";
        String password = "123123";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    private static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
        String connectionURL ="jdbc:mysql://localhost/videolybrary?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
        Connection conectn = DriverManager.getConnection(connectionURL, userName, password);
        return conectn;
    }
}
