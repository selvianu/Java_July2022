package com.chainsys.java8.reference;

@FunctionalInterface
public interface ProductInter {
	public abstract ProductCons get(String name);
}

class ProductCons {
	private String str;

	public ProductCons(String str) {
		this.str = str;
		System.out.println("The name of the product is: " + str);
	}
}