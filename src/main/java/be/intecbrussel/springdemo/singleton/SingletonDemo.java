package be.intecbrussel.springdemo.singleton;

// Singleton : A class which will/should have only 1 instance for the complete
// run of an application...
public class SingletonDemo {
    private static SingletonDemo instance = new SingletonDemo();
    public static SingletonDemo getInstance() {
        return instance;
    }

    private SingletonDemo() {

    }
}
