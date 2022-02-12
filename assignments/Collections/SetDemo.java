package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Raghu");
		s.add("Nandan");
		s.add("Madhu");
		s.add("Sudhan");
		System.out.println(s);
		
		Iterator itr = s.iterator();
		if(itr!=null) {
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
}
