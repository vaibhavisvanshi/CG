package com.demo.java8.streams;

import java.util.ArrayList;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class StreamFilterDemo {

	public static void main(String[] args) {
		ArrayList<Product> arraylist = new ArrayList<>();
		arraylist.add(new Product(1, "Samsung",20000));
		arraylist.add(new Product(2, "mi",2000));
		arraylist.add(new Product(3, "oppo",5400));
		arraylist.add(new Product(4, "vivo",5000));
		
		arraylist.stream().filter(prod ->prod.price>3000).map(prod ->prod.name).forEach(System.out::println);
	
		
	}

}