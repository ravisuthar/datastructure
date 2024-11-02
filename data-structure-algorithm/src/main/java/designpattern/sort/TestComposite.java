package designpattern.sort;

import java.util.ArrayList;
import java.util.List;

interface Shape{
	void draw(String color);
}

class Triangle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("drawing Triangle with color: "+color);
	}
	
}

class Circle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("drawing Circle with color: "+color);
	}
	
}

class Drawing implements Shape{

	List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw(String color) {
		shapes.forEach(s -> s.draw(color));
	}
	
	//adding shape to drawing
		public void add(Shape s){
			this.shapes.add(s);
		}
		
		//removing shape from drawing
		public void remove(Shape s){
			shapes.remove(s);
		}
		
		//removing all the shapes
		public void clear(){
			System.out.println("Clearing all the shapes from drawing");
			this.shapes.clear();
		}
}
public class TestComposite {

	public static void main(String[] args) {
		
		Drawing d = new Drawing();
		d.add(new Triangle());
		d.add(new Circle());
		d.draw("Red");
	}
}
