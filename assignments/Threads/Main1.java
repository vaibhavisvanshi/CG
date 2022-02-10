package pack1;
/*
 * 
 *  Create a thread which prints 1 to 10. After printing 5, 
 *   there should be a delay of 5000 milliseconds before printing 6
 *   
 * */
class Thread1 extends Thread {

	public void run() { // this method run() is given by java api

		try {

			for (int i = 1; i <= 10; i++) {
				if (i == 6) { //when i==6 
					Thread1.sleep(5000);// 5 seconds
				}
				System.out.println(i);

			}

		} catch (InterruptedException e) {

		}
	}

}

public class Main1 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1(); // thread created
		t1.start();
	}

