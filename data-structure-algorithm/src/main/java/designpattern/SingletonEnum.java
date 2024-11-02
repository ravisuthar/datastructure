package designpattern;

public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum() {
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }
}
