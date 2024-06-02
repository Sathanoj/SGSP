package com.sgspproject.sgsp.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionToApp {
    private final Connection connection;
    
    public ConnectionToApp() {
        connection = DataBase.getConnection();
    }
    
    public ResultSet selectQuery(String query) {
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
    
    public PreparedStatement insertQuery(String query) {
      PreparedStatement preparedStatement = null;
      try {
          preparedStatement = connection.prepareStatement(query);
      } catch (SQLException ex) {
          Logger.getLogger(ConnectionToApp.class.getName()).log(Level.SEVERE, null, ex);
      }
      return preparedStatement;
    }
}
