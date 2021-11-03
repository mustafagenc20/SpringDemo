package be.intecbrussel.springdemo.pubsub;

import org.springframework.context.ApplicationEvent;

public class RequestEvent extends ApplicationEvent {

    public RequestEvent(Object source) {
        super(source);
    }
}
