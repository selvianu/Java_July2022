package com.chainsys.functionalinterface;

public class TestEmp {

	public static void main(String[] args) {

		Employee e1 = new EmployeeImpl();
		e1.save();
		e1.delete();
		Employee.update();
	}

}
