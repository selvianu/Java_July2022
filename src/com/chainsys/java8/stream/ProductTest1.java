package com.chainsys.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductTest1 {
	public static void main(String args[]) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "La", 30000));
		productList.add(new Product(2, "Mobile", 10000));
		productList.add(new Product(3, "HP", 30000));
		productList.add(new Product(4, "Tablet", 45000));
		productList.add(new Product(5, "Monitor", 3000));
		
		List<Integer> productPrice = productList.stream().filter(i -> i.price < 30000).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(productPrice);
		productList.stream();
	}
}
