package designpattern.pattern.creational.singleton;

public class EagerInitialization {

	private static final EagerInitialization INSTANCE= new EagerInitialization();
	
	private EagerInitialization(){super();}
	
	public static EagerInitialization getInstance(){
		return INSTANCE;
	}
}
