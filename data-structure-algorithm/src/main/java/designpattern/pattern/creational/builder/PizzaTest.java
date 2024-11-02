package designpattern.pattern.creational.builder;

public class PizzaTest {

	public static void main(String[] args) {
		
		Pizza dominos = new Pizza.PizzaBuilder("thin crust", "tomato").setCheese("cheese").build();
		System.out.println(dominos);
	}
}
