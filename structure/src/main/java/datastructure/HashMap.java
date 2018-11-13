package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {

			Map<String, String> map=new LinkedHashMap<String, String>();
			map.put("a", "a");
			map.put("a", "b");
			map.put(null, "c");
			System.out.println(map.get(null));
			
	}
}
