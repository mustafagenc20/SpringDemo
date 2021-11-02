package be.intecbrussel.springdemo.config;

import be.intecbrussel.springdemo.service.ElectricalOven;
import be.intecbrussel.springdemo.service.Oven;
import be.intecbrussel.springdemo.service.PizzaService;
import be.intecbrussel.springdemo.service.StoneOven;
import org.springframework.context.annotation.*;

//@Configuration
public class BeanFactory {
    @Bean
    public ElectricalOven createElectricalOven() {
        return new ElectricalOven();
    }

    @Bean
    @Primary
    @Scope(value = "prototype")
    public StoneOven createStoneOven() {
        return new StoneOven();
    }

    // In this context
    // Stateless >> The instance does NOT hold any shared data >> singleton scope will do
    // Statefull >> The instance DOES hold shared data. >> scope prototype is adviced

    @Bean
    @Lazy
    public Oven createOven() {
        if (false) return new ElectricalOven();
        else return new StoneOven();
    }

//    @Bean
//    public PizzaService createPizzaService() {
//        return new PizzaService();
//    }

    private void internalMethod() {
        // This method is not used by spring
    }
}