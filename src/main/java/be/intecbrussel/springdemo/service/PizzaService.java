package be.intecbrussel.springdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PizzaService {
    private Oven oven;

    @Value("${hello}")
    private String hello;

    public PizzaService(Oven oven) {
        System.out.println("Creating Pizza Service");
        this.oven = oven;
    }

    @PostConstruct
    public void startup() {
        System.out.println(hello);
    }

}
