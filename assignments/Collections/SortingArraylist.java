package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SortingArraylist {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Raghu");
		s.add("Nandan");
		s.add("Madhu");
		s.add("Sudhan");
		System.out.println(s);
		System.out.println("for loop:");
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
		System.out.println(" using enchanced loop  ");
        for(String fruits:s) {
		
			System.out.println(fruits);
        }
}
}

