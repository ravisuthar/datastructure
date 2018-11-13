package pattern.creational.singleton;

public class StaticBlockInitialization {

	//final cannot be used
	private static StaticBlockInitialization INSTANCE;
	
	static{
	    try{
		INSTANCE= new StaticBlockInitialization();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private StaticBlockInitialization(){super();}
	
	public static StaticBlockInitialization getInstance(){
		return INSTANCE;
	}
}
