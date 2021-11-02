package be.intecbrussel.springdemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//@Component
//@Profile("production")
public class DBConnectorProduction {
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://production.server.be/testDB");
    }
}
