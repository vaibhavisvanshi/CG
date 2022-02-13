package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo{
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(0, "Ram");
		m.put(1, "Shyam");
		m.put(2, "Jai");
		m.put(3, "Ajay");
		System.out.println(m);
		
		  Set set=m.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
			}
		}
	}
