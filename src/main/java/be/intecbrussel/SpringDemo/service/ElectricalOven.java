package be.intecbrussel.SpringDemo.service;

import org.springframework.stereotype.Component;

@Component
public class ElectricalOven implements Oven{

    @Override
    public void bakePizza(){
        System.out.printf("Bzzzzz.... Baking le pizza with electrical");
    }
}
