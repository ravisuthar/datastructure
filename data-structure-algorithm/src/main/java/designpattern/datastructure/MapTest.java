package designpattern.datastructure;

import java.util.*;
import java.util.HashMap;

class Unit{
	int i;
	String name;
	
	
	public Unit(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		if (i != other.i)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Unit [i=" + i + ", name=" + name + "]";
	}
	
	
}
public class MapTest {

	public static void main(String[] args) {
		
		Map<Unit, Unit> map=new HashMap<Unit, Unit>();
		Unit a= new Unit(1, "a");
		Unit b= new Unit(2, "b");
		Unit c= new Unit(3, "c");
		Unit d= new Unit(4, "d");
		map.put(a,a);
		map.put(b,b);
		map.put(c,c);
		map.put(d,d);
		
		System.out.println(map.get(a));
		
		
	}
}
