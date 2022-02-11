package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Intermediate operators
 * filter(),   map(),   sorted()
 * 
 * */
public class ClassDemo4{

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Sridhar");
		names.add("Madhav");
		names.add("Rghunandan");
		names.add("Ram");
		names.add("Govind");
		names.add("Anant");
		names.add("Srikar");
		names.add("Vishnu");
	
		Stream<String> stream1=	names.stream();
		stream1.filter((s)->s.startsWith("A")).forEach(System.out::println);
		
		Stream<String> stream2=	names.stream();
		stream2.filter((s)->s.startsWith("R")).map(String::toUpperCase).forEach(System.out::println);
		
		Stream<String> stream3=	names.stream();
		stream3.sorted().forEach(System.out::println);
	
	}

}
