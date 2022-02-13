package collections;

import java.util.LinkedList;

public class LinkedListtDemo{

	public static void main(String[] args) {
	LinkedList <String> l= new LinkedList<>();
	l.add("Apple");
	l.add("mango");
	l.add("banana");
	l.add("grapes");
	l.add("Apple");
	l.add("melon");
	System.out.println(l);
	for (String i : l) {
		System.out.println(i);	
	}
	l.addFirst("Watermelon");
	l.addLast("cherry");
	System.out.println(l);
	for (String i : l) {
		System.out.println(i);	
	}
}

}