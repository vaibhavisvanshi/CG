package collections;
/*
 * Vector is like the dynamic array which can grow or shrink its size
 * Vector is synchronized. Java Vector contains many legacy methods that are not
 * the part of a collections framework.
 * 
 * */
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	Vector<String> v=new Vector<>();
	v.add("Vajraa");
	v.addElement("varun");
	v.add("vaii");
	v.addElement("Vihaan");
	v.add("varun");
	v.addElement("vishnu");
	System.out.println(v);
	System.out.println("size: "+v.size());

	}
}