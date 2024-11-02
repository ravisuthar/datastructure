package designpattern;

import java.io.Serializable;

public class SingletonEagerInitialization implements Serializable {

    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {
    }

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
