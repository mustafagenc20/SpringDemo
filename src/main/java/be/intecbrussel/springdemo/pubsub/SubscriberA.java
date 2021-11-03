package be.intecbrussel.springdemo.pubsub;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberA {

    public SubscriberA(){
        System.out.println("subscriber created");
    }

    @EventListener
    public void listenToEvent(DataEvent event){
        System.out.println("Event received in SubscribeA");
        System.out.println("SubscriberA: " + event.getSource());
    }
}
