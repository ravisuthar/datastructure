package designpattern.pattern.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton INSTANCE;

	private ThreadSafeSingleton() {
		super();
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (null == INSTANCE)
			INSTANCE = new ThreadSafeSingleton();

		return INSTANCE;
	}

}
