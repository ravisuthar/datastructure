package pattern.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 8811897321742486251L;

	private SerializedSingleton() {
		super();
	}

	public static SerializedSingleton getInstance() {
		return Inner.INSTANCE;
	}

	// does not required synchronization
	private static class Inner {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	//read same object
	protected Object readResolve() {
		return getInstance();
	}
}
