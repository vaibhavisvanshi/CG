package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "Vaii");
		map.put(2, "Vishnu");
		map.put(3, "Varun");
		map.put(4, "Vajra");
		map.put(5, "Vaishnav");

		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
