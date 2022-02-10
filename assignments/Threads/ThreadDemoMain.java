package pack1;
/*
Create two threads and assign names ‘Ram’ and ‘Shyam’ to the two threads. Display both thread names.
	Setting the name of the thread. 
    */

public class ThreadDemoMain {

	public static void main(String[] args) {
		Thread t1 = new Thread("Ram");
		System.out.println(t1.getName());
		Thread t2 = new Thread("Shyam");
		System.out.println(t2.getName());

	}

}
