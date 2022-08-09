package com.chainsys.java8;

import java.util.ArrayList;

public class LambdaExpr {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		for (Integer nos : numbers) {
			System.out.println("Using foreach : " + nos);
		}
		numbers.forEach((n) -> {
			System.out.println("Using Lambda expression : " + n);
		});
	}
}