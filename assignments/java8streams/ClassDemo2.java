package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * we are creating a stream on integers 1 to 10.
 *  Then we are processing the stream elements to find all even numbers.

At last, we are collecting all even numbers into a List.
 * 
 * */
public class ClassDemo2 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Stream<Integer> stream = l.stream();
		List<Integer> evenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

	}

}