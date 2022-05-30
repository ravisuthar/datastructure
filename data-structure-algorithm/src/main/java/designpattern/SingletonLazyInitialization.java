package designpattern;

import java.io.Serializable;

public class SingletonLazyInitialization  {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {

    }

    public static SingletonLazyInitialization getInstance() {
        if (null == instance) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}
