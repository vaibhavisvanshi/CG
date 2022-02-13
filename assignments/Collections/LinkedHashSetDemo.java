package collections;
/*
 * 
 * Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operation and permits null elements.
Java LinkedHashSet class is non synchronized.
Java LinkedHashSet class maintains insertion order.
 * 
 * */
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo{

	public static void main(String[] args) {
		LinkedHashSet<String> s=new LinkedHashSet<>();
		s.add("Raghu");
		s.add("Nandan");
		s.add("Madhu");
		s.add("Sudhan");
		s.add("Madhu");
		s.add("Sudhan");
		s.add(null);
		s.add(null);
		System.out.println(s);
		Iterator<String> itr=s.iterator();
		if(itr!=null) {
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
	}

}
