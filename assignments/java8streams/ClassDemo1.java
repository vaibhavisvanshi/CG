package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClassDemo1 {

//elements in the stream are taken from the List

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			l.add(i);                            //adding elements
		}
		Stream<Integer> stream=l.stream();            
		stream.forEach(p->System.out.println(p));
	}

}