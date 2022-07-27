package cys.training.day8.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Student {

	public static void main(String[] args) {
		ArrayList studentList = new ArrayList();

		studentList.add("Anu");
		studentList.add(101);
		studentList.add(450.87);
		studentList.add(1, "abi");
		for (Object object : studentList) {
			System.out.println(object);
		}
		ArrayList studentList1 = new ArrayList();
		studentList1.addAll(studentList);
		for (Object object : studentList1) {
			System.out.println(object);
		}

		LinkedList list = new LinkedList();
	}

}
