package designpattern.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflection2DestroySingletonPattern {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		EagerInitialization one=EagerInitialization.getInstance();
		EagerInitialization two=null;
		
		Constructor[] cons= EagerInitialization.class.getDeclaredConstructors();
		for(Constructor c:cons){
			c.setAccessible(true);
			two= (EagerInitialization)c.newInstance(null);
		}
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
	}
}
