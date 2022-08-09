package com.chainsys.java8.reference;

public class ConsReference {

	public static void main(String[] args) {
//used to refer to the constructor without instantiating the named class.
//Constructor reference
		ProductInter pdtCons = ProductCons::new;
		pdtCons.get("Yamuna");
//constructor - instance
		ProductCons pdt = new ProductCons("Anand");
		System.out.println(pdt);
	}

}
