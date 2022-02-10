package pack1;

class MyCounter extends Thread {
	private int threadNo;

	public MyCounter(int threadNo) {

		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		countMe();
	}

	public void countMe() {
		for (int i = 1; i <= 9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());

			}
			System.out.println("The value of i is: " + i + "     and thread no is: " + threadNo);

		}
	}

}

public class MyCounterMain {

	public static void main(String[] args) {
		MyCounter c1 = new MyCounter(1);
		MyCounter c2 = new MyCounter(2);
		long startTime = System.currentTimeMillis();
		c1.run();
		System.out.println("***************************************************");
		c2.run();
		try {
			Thread.sleep(4505);
		} catch (InterruptedException e) {
			// System.out.println(e.getMessage());

		}

		long endTime = System.currentTimeMillis();
		System.out.println("start time of process: " + startTime + "    end time of process:" + endTime
				+ "     total time of process:" + (endTime - startTime));
	}

}
