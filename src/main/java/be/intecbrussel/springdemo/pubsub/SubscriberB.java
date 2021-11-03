package be.intecbrussel.springdemo.pubsub;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberB {

    @EventListener
    public void listenToEvent(RequestEvent event){
        System.out.println("Event received in SubscribeB");
        System.out.println("SubscriberB: " + event.getSource());
    }
}
