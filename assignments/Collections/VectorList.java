package collections;

import java.util.Vector;

public class VectorList {
	private Vector<Integer> list = new Vector<Integer>();

	public Vector<Integer> saveEvenNumbers(int N) {
		list = new Vector<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				list.add(i);
			}
		}

		return list;
	}

	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> newListt = new Vector<Integer>();

		for (int item : list) {
			newListt.add(item * 2);
			System.out.println(item * 2);
		}

		return newListt;
	}

	public Integer printEvenNumber(int N) {

		for (int item : list) {
			if (item == N) {
				return N;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		VectorList vlist = new VectorList();
		vlist.saveEvenNumbers(10);
		
		vlist.printEvenNumbers();
		int result = vlist.printEvenNumber(8);
		System.out.println("The number is: " + result);

	}

}