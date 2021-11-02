package be.intecbrussel.springdemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Profile("stone_age")
//@Order(1)
public class StoneOven implements Oven {
    public StoneOven() {
        System.out.println("Building a Stone Oven");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking the pizza....");
    }
}
