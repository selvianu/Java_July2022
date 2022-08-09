package com.chainsys.java8;

public class FnInterImpl2 {

	public static void main(String[] args) {

		FunInter1 f = () -> System.out.println("In Lambda expresion test method");
		f.test();
		f.test1();
	}
}