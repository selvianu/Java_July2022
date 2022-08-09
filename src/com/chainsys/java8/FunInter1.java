package com.chainsys.java8;

@FunctionalInterface
public interface FunInter1 {
	public abstract void test();

	default void test1() {
		System.out.println("in default");
	}

	static void test2() {
		System.out.println("in static");
	}

}
