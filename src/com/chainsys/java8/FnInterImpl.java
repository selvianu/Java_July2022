package com.chainsys.java8;

public class FnInterImpl implements FunInter1 {

	@Override
	public void test() {

		System.out.println("In test method");
	}

	public void welcomeUser(String name) {
		System.out.println("Welcome" + name);
	}
	/*
	 * (String name)-> { System.out.println("Welcome" + name); }
	 */

	public static void main(String[] args) {

		FunInter1 f = new FnInterImpl();
		f.test();
		f.test1();
		FunInter1.test2();
	}

}
