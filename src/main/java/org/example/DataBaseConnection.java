package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3307/aca";
        String password = "admin";
        String userName = "root";
        connection = DriverManager.getConnection(url, userName, password);
        System.out.println("DataBaseConnection - Connected to the database!");
        return connection;
    }
}
