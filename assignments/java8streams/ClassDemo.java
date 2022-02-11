package com.demo.java8.streams;


import java.util.stream.Stream;

public class ClassDemo {

	public static void main(String[] args) {
		//creating a stream of a fixed number of integers.
		Stream<Integer> stream = Stream.of(5, 4, 6, 7, 9, 8, 0, 3, 2, 1);
		stream.forEach(p -> System.out.println(p));
		
		//Stream.of(array)---elements in the stream are taken from the array.
		
		Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.println(p));
		

	}

}
