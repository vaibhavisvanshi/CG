package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//collecting the even numbers in an Array.

public class ClassDemo3 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for (int i = 1;i<=10;i++) {
			l.add(i);
		}
		Stream<Integer> stream = l.stream();
		Integer[] evenArray = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		for(int i=0;i<evenArray.length;i++) {
		System.out.println(evenArray[i]);
		}
	}

}
