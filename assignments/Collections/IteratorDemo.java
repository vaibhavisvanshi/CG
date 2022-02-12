package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<>();
	l.add("Raghu");
	l.add("Nandan");
	l.add("Madhu");
	l.add("Sudhan");
	System.out.println(l);

	Iterator itr = l.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}

}
