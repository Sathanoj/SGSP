package com.sgspproject.sgsp.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToApp {
    private final Connection connection;
    
    public ConnectionToApp() {
        connection = DataBase.getConnection();
    }
    
    public ResultSet executQuery(String query) {
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return resultSet;
    }
}
