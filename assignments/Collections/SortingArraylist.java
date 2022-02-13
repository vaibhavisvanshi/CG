package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
Collections.sort() function
*/

public class SortingArraylist {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
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

		Collections.sort(s);
		System.out.println(s);
		Iterator<String> itr1 = s.iterator();
		if(itr1!=null) {
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
}
