package pack1;

/**
 * 
 * The Thread class provides methods to change and get the name of a thread. By
 * default, each thread has a name, i.e. thread-0, thread-1 and so on. 
 *  we can change the name of the thread by using the setName() method. 
 *  The syntax of setName() and getName() methods are given below:
 * 
 * 
 * CREATION OF THREADS USING SUPERCLASS "THREAD"
 * 
 */

class ThreadDemo1 extends Thread {

	Thread t;
	String ThreadName;

	// constructor
	ThreadDemo1(String threadname) {

		ThreadName = threadname;
		System.out.println("creating " + threadname);

	}

	// write logic here

	public void run() {

		try {
			for (int i = 8; i > 0; i--) {
				System.out.println("Thread " + ThreadName + " ," + i);
				Thread.sleep(7000);/// this will catch the cpu time of windows os
			}
		} catch (InterruptedException e) {
			System.out.println("thread " + ThreadName + " has been Interrupted");

		}

	}

	public void start() {

		System.out.println("thread is starting " + ThreadName);

		if (t == null) {
			t = new Thread(this, ThreadName);// new thread created and assign the name to thread class
			t.start();

		}

	}

}

public class ThreadDemo {
public ThreadDemo(String str){
	
}

	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1(" thread 1");
		t1.start();

		ThreadDemo1 t2 = new ThreadDemo1(" thread 2");
		t2.start();

	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}