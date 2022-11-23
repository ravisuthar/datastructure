package designpattern.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable{

	private List<String> list = new ArrayList<>();
	
	public User(List<String> list ) {
		 this.list= list;
	}
	
	public List<String> getList(){
		return this.list;
	}
	
	
	@Override
	protected User clone() throws CloneNotSupportedException {
		
		List<String> copy = new ArrayList<>();
		for(var s: list) {
			copy.add(s);
		}
		return new User(copy);
	}
	
}
