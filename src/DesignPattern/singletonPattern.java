package DesignPattern;

public class singletonPattern {

    //volatile ensures to make variable value visible to all threads instantly
    private volatile static singletonPattern instance;

    private singletonPattern() {
    }

    // make thread safe
    // use double locking to make thread safe
    public  static singletonPattern getInstance() {
        if (instance == null) { // first check if instance is null
            synchronized (singletonPattern.class) { // second check
                    instance = new singletonPattern();
            }
        }
        return instance;
    }
}
