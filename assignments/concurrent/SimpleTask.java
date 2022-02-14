package com.demo.concurrent;

public class SimpleTask  implements Runnable{

	private long sleepTime;

	public SimpleTask(long sleepTime) {
		super();
		this.sleepTime = sleepTime;
	}
  //logic
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Simple task is running on " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}


