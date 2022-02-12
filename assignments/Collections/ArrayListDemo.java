package collections;



import java.util.ArrayList;

/*
 * can contain duplicate elements.
   maintains insertion order.
   its non synchronized.
   allows random access because array works at the index basis.
In ArrayList, manipulation is little bit slower than the 
LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
 * 
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Madhav");
		list.add("Govind");

		System.out.println(list);

	}

}