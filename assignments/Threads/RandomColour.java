package pack1;

import java.util.Random;

public class RandomColour implements Runnable {

	public static void main(String[] args) {
		RandomColour RC = new RandomColour();
		Thread t1 = new Thread(RC);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}