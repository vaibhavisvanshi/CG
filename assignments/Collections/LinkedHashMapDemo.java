package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
 * Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75--room creating capacity in memory
 * 
 * */
public class LinkedHashMapDemo{

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(0, "Ram");
		m.put(1, "Shyam");
		m.put(2, "Jai");
		m.put(3, "Ajay");
		System.out.println(m);

		Set set = m.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(" Key --> " + entry.getKey() + " value --> " + entry.getValue());

		}

	}
}
