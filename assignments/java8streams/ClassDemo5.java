package com.demo.java8.streams;
/*
 * terminal ops-forEach(),  collect(),   match();  count(),   reduce()
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassDemo5 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Sridhar");
		names.add("Madhav");
		names.add("Raghunandan");
		names.add("Ram");
		names.add("Govind");
		names.add("Anant");
		names.add("Srikar");
		names.add("Vishnu");

		Stream<String> stream1 = names.stream();
		stream1.sorted().forEach(System.out::println);
		System.out.println();

		Stream<String> stream2 = names.stream();
		List<String> evenList = stream2.collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println();

		boolean matchedResult = names.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult); // t
		matchedResult = names.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult); // f
		matchedResult = names.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);// f
		System.out.println();

		Stream<String> stream4 = names.stream();
		System.out.println(stream4.count());
		long totalMatched = names.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched);
		System.out.println();

		Optional<String> reduced = names.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);
	}

}