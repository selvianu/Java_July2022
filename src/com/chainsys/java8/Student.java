package com.chainsys.java8;

@FunctionalInterface
public interface Student {
	//public abstract void save();
	public abstract void save(int id, int id1);

	public default void update() {
		System.out.println("To update the records...");
	}

	public static void delete() {
		System.out.println("To delete the records..");
	}

}
