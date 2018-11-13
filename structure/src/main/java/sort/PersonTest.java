package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person(3, "H", 12, 15200.00));
		list.add(new Person(1, "G", 14, 50020.00));
		list.add(new Person(2, "B", 13, 100230.00));
		list.add(new Person(5, "F", 15, 70023.00));
		list.add(new Person(4, "E", 16, 10650.00));
		list.add(new Person(6, "B", 17, 3010.00));
		list.add(new Person(8, "D", 18, 1010.00));
		list.add(new Person(7, "C", 19, 5020.00));
		list.add(new Person(9, "H", 10, 2020.00));
		list.add(new Person(10, "A", 88, 6600.00));

		System.out.println("by Id: "+SortBy(list, "id"));
	//	System.out.println("by name: "+SortBy(list, "name"));
//		System.out.println("by age: "+SortBy(list ,"age"));
//		System.out.println("by salary: "+SortBy(list, "salary"));
		
		
	}

	public static List<Person> SortBy(List<Person> list, String name) {


		 switch (name) { //java 8 
				case "id":
					list = list.stream()
					.sorted((e1, e2) -> {return e1.getId() > e2.getId() ? 1 :e1.getId() < e2.getId() ? -1 :0; })
					.collect(Collectors.toList());
					break;
				case "name":
					list = list.stream()
							.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
							.collect(Collectors.toList());
					break;
				case "salary":
					list = list.stream()
							.sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))
							.collect(Collectors.toList());
					break;
				case "age":
					list = list.stream()
					.sorted((e1, e2) -> { return e1.getAge() > e2.getAge() ? 1 : e1.getAge() < e2.getAge() ? -1 : 0; })
					.collect(Collectors.toList());
					break;
				default:
				throw new IllegalArgumentException("No arg supplied for sorting!...");
	    	}

		return list;
	}
}
