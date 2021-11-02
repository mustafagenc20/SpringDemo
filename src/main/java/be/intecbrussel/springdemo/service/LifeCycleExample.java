package be.intecbrussel.springdemo.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class LifeCycleExample {
    /*
        1. Instantiatie - new - constructor
        2. Dependency Injection - field/property injection
        3. Initialisatie - PostConstruct
        4. Gebruik in de applicatie
        5. Garbage collection - PreDestroy - finalize()
     */

    public LifeCycleExample() {
        System.out.println("LifeCycleExample class constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Post construct method in LifeCycleExample");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Pre Destroy method in LifeCycleExample");
    }

}
