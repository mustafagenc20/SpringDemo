package be.intecbrussel.springdemo.pubsub;

import org.springframework.context.ApplicationEvent;

public class DataEvent extends ApplicationEvent {
    public DataEvent(Object source){
        super(source);
    }
}
