package designpattern.pattern.creational.singleton;

public class LazyInitialization {

	private static LazyInitialization INSTANCE;
	
	private LazyInitialization(){super();}
	
	public static LazyInitialization getInstance(){
		if(null==INSTANCE)
			INSTANCE=new LazyInitialization();
		
		return INSTANCE;
	}
}
