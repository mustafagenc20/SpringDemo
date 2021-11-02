package be.intecbrussel.springdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DBConnector {
    @Value("${database.connection}")
    private String connectionString;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;

    @PostConstruct
    public void startup() {
        System.out.println("Making connection with the following params:");
        System.out.println(connectionString);
        System.out.println(username);
        System.out.println(password);
    }
}
