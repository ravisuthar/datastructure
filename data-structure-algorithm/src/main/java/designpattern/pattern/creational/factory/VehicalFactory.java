package designpattern.pattern.creational.factory;


class Vehical{

	private String name;
	private String type;
	public Vehical(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	
}

class Car extends Vehical{

	public Car(String name, String type) {
		super(name, type);
	}
	
}

class Scooter extends Vehical{

	public Scooter(String name, String type) {
		super(name, type);
	}
	
}



public class VehicalFactory {

	public static Vehical getVehical(String type) {
		
		if(type.equals("Car")){
			return new Car("maruti","800");
		}else if(type.equals("Scooter")){
			return new Car("Activa","125");
		}else {
			throw new RuntimeException("type not present");
		}
	}
	
	
}
