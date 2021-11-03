package be.intecbrussel.springdemo.pubsub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Publisher {
    public ApplicationEventPublisher eventPublisher;

    public Publisher(ApplicationEventPublisher publisher){
        System.out.println("Publisher created");
        this.eventPublisher = publisher;
    }

    // LifeCycle van een bean
    public void sendEvent(){
        System.out.println("Sending event");
        eventPublisher.publishEvent(new DataEvent("Publisher created... Hello from the publisher..."));
    }
}
