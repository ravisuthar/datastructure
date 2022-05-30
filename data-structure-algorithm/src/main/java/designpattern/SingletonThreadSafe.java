package designpattern;

public class SingletonThreadSafe {
    private static final SingletonThreadSafe INSTANCE = new SingletonThreadSafe();

    private SingletonThreadSafe() {
    }

    public synchronized static SingletonThreadSafe getInstance() {
        return INSTANCE;
    }
}
