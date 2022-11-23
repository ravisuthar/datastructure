package designpattern.sort;

import java.util.HashMap;
import java.util.Map;
/*

import pattern.structural.flyweight.Line;

interface Shape1{
	void draw(String draw);
}

class Line1 implements Shape1{
	public void draw(String draw) {
		System.out.println("Drawing "+draw);
	}
}

 
class Circle1 implements Shape1{
	public void draw(String draw) {
		System.out.println("Drawing "+draw);
	}
}

enum ShapeType{
	LINE,
	CIRCLE
}
class ShapeFactory {
	
	Map<ShapeType, Shape1>  map = new HashMap<ShapeType, Shape1>();
	
	public Shape1 getShape(ShapeType shapeType) {
	
		if(map.containsKey(shapeType)) return map.get(shapeType);
		
		Shape1 shape1 = null;
		switch(shapeType) {
		case LINE:
			shape1= new Line1();
			break;
		case CIRCLE:
			shape1= new Circle1();
			break;
		}
		map.put(shapeType, shape1);
		
		return shape1;
	}
	
}

public class TestFlyWeightDesignPattern {

}
*/
