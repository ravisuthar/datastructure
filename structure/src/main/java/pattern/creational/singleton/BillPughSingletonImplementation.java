package pattern.creational.singleton;

public class BillPughSingletonImplementation {
	
	private BillPughSingletonImplementation(){super();}
	
	
	public static BillPughSingletonImplementation getInstance(){
		return Inner.INSTANCE;
	}
	
	// does not required synchronization
	private static class Inner{
		private static final BillPughSingletonImplementation INSTANCE= new BillPughSingletonImplementation();
	}
}
