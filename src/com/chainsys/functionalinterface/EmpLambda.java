package com.chainsys.functionalinterface;

public class EmpLambda {
	public static void main(String args[]) {
		Employee e1 =

				(no, no1) -> (no + no1);
		int sum = e1.save(10, 5);
		System.out.println(sum);
		e1.delete();
		Employee.update();

	}
}
