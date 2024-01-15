package org.example;

import java.sql.Connection;

public class Repository {
    Connection connection;
    public Repository(Connection connection){
        this.connection = connection;
    }
}
