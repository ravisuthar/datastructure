package designpattern;

public class SingletonThreadSafeDoubleLocking {
    private static SingletonThreadSafeDoubleLocking instance;

    private SingletonThreadSafeDoubleLocking() {

    }

    public static SingletonThreadSafeDoubleLocking getInstance() {
        if (null == instance) {
            synchronized (SingletonThreadSafeDoubleLocking.class) {
                if (null == instance) {
                    instance = new SingletonThreadSafeDoubleLocking();
                }
            }
        }
        return instance;
    }


}
