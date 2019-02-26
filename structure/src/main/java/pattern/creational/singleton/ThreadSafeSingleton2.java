package pattern.creational.singleton;

public class ThreadSafeSingleton2 {

	private static volatile ThreadSafeSingleton2 INSTANCE;

	private ThreadSafeSingleton2() {
		super();
	}

	public static ThreadSafeSingleton2 getInstance() {
		if (null == INSTANCE)
			synchronized(ThreadSafeSingleton2.class){
				if (null == INSTANCE){
					INSTANCE = new ThreadSafeSingleton2();
				}
			}

		return INSTANCE;
	}

}
