package com.demo.java8.streams;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//functional style programming.
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);
	}

}
