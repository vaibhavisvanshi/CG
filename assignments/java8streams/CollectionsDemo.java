package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product1 {
	int id;
	String name;
	int price;

	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Product1> arraylist = new ArrayList<>();
		arraylist.add(new Product1(1, "Samsung", 20000));
		arraylist.add(new Product1(2, "mi", 2000));
		arraylist.add(new Product1(3, "oppo", 5400));
		arraylist.add(new Product1(4, "vivo", 5000));
		arraylist.add(new Product1(6, "asus", 2500));
		arraylist.add(new Product1(5, "micromax", 2000));

//set
		Set<Integer> result = arraylist.stream().map(prod -> prod.price).collect(Collectors.toSet());
		System.out.println("prod" + result);
//list		
		List<Integer> result1 = arraylist.stream().map(prod -> prod.price).collect(Collectors.toList());
		System.out.println("prod" + result1);
	}

}