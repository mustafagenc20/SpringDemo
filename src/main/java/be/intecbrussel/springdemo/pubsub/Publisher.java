package be.intecbrussel.springdemo.pubsub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Publisher {
    @Autowired
    public ApplicationEventPublisher eventPublisher;

    // LifeCycle van een bean

    @PostConstruct
    public void sendEvent(){
        eventPublisher.publishEvent("Publisher created... Hello from the publisher");
    }
}
