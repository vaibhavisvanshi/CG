package pack1;
/*
Create two threads and assign names ‘Shaggy’ and ‘Scooby’ to the two threads. Display both thread names.
	Setting the name of the thread. 
    */

public class ShaggyScooby {

	public static void main(String[] args) {
		Thread t1 = new Thread("Shaggy");
		System.out.println(t1.getName());
		Thread t2 = new Thread("Scooby");
		System.out.println(t2.getName());

	}

}
