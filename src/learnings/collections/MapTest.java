package learnings.collections;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> m = new HashMap<String, String>();
		
		m.put("name", "Amisha");
		m.put("address", "Pune");
		m.put("phone", "9876543210");
		m.put("address", "Mumbai");
		
		System.out.println(m);
		
		Set<String> keys = m.keySet();
		
		for (String key : keys) {
			System.out.println(key + ": " + m.get(key));
		}
		
		System.out.println(m.containsKey("address"));
		System.out.println(m.containsValue("Mumbai"));
		
		m.remove("address");
		System.out.println(m);
		
		
		m.replace("phone", "1234567890");
		System.out.println(m);
	}

}
