package designpattern.pattern.creational.prototype;

import java.util.List;

public class UserTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		var list =List.of("A","B");
		User user = new User(list);
		
		User clone = user.clone();
		var clonedList = clone.getList();
		clonedList.add("C");
		
		System.out.println(user.getList());
		System.out.println(clone.getList());
	}
}
