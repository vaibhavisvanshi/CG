package pack1;

/*
 * Create two threads, one thread to display all even numbers between 1 & 20, 
 * another to display odd numbers between 1 & 20.
 * Note: Display all even numbers followed by odd numbers
 * Hint: use join
 * Use of join method and thread control mechanism 
 * 
 * 
 * */
class Thread_1 implements Runnable {
	public void run() {
		for (int i = 2; i < 20; i += 2) {
			System.out.println(i);
		}
	}
}

class Thread_2 implements Runnable {
	public void run() {
		for (int i = 3; i < 20; i += 2) {
			System.out.println(i);
		}
	}
}

public class Main2 {

	public static void main(String[] args) {
		Runnable r1 = new Thread_1();
		Thread t1 = new Thread(r1);
		Runnable r2 = new Thread_2();
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}