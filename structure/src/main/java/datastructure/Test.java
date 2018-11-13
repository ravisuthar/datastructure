package datastructure;

import java.io.IOException;

class Animal {

	private  Animal eat(Animal a ){
		System.out.println("Animal");
		return new Animal();
	}
}

class Dog extends Animal {
	
	public Dog eat(Dog a) throws IOException{
		System.out.println("Dog");
		return new Dog();
	}
}

public class Test {

	public static void main(String[] args) throws IOException {
		Animal a = new Dog();

	}
}
