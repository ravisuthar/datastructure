package datastructure;

import java.util.HashMap;
import java.util.Map;

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
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
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

public class HashTableTest {

	public static void main(String[] args) {
		
		
		Map<Emp, Emp> map=new HashMap<Emp, Emp>();
		Emp emp1=new Emp(1, "A");
		Emp emp2=new Emp(2, "B");
		Emp emp3=new Emp(3, "C");
		Emp emp4=new Emp(4, "D");
		Emp emp5=new Emp(5, "E");
		Emp emp6=new Emp(6, "F");
		
		map.put(emp1, emp1);
		map.put(emp2, emp2);
		map.put(emp3, emp3);
		map.put(emp4, emp4);
		map.put(emp5, emp5);
		map.put(emp6, emp6);
		
		map.get(emp6);
		
		
		
	}
}
