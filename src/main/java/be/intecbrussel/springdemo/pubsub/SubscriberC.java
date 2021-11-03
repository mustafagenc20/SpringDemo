package be.intecbrussel.springdemo.pubsub;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberC {

    @EventListener
    public void listenToEvent(DataEvent event){
        System.out.println("Event received in SubscribeC");
        System.out.println("SubscriberC: " + event.getSource());
    }

    @EventListener
    public void listenToEvent(RequestEvent event){
        System.out.println("Event received in SubscribeC");
        System.out.println("SubscriberC: " + event.getSource());
    }

}
