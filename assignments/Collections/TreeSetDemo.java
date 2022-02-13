package collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		s.add("Raghu");
		s.add("Nandan");
		s.add("Madhu");
		s.add("Sudhan");
		System.out.println(s);
		
		Iterator<String> itr = s.iterator();
		if(itr!=null) {
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
}
