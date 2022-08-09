package com.chainsys.functionalinterface;

@FunctionalInterface
public interface Employee {
	public abstract int save(int no1, int no2);

	public static void update() {
		System.out.println("Method to update");
	}

	public default void delete() {
		System.out.println("Method to delete");
	}
}
