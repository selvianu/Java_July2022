package cys.training.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ExampleList {

	public static void main(String[] args) {
		System.out.println("ArrayList Implementation");
		ArrayList al = new ArrayList();

		for (int i = 1; i <= 5; i++)
			al.add(i);
		// printing as arraylist object
		System.out.println(al);
		// printing element inserted order
		for (Object object : al) {
			System.out.println(object);
		}

		/*
		 * LinkedList class is an implementation of the LinkedList data structure which
		 * is a linear data structure where the elements are not stored in contiguous
		 * locations and every element is a separate object with a data part and address
		 * part. The elements are linked using pointers and addresses. Each element is
		 * known as a node.
		 */
		System.out.println("Linked List Implementation");
		LinkedList ll = new LinkedList();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			ll.add(i);

		// Printing elements
		System.out.println(ll);

		// Remove element at index 3
		ll.remove(3);

		// Displaying the List
		// after deletion
		System.out.println(ll);
		// Printing elements one by one
		for (int i = 0; i < ll.size(); i++)
			System.out.println(ll.get(i) + " ");
		ll.pop();
		System.out.println("After Pop" + ll);

		// A vector provides us with dynamic arrays in Java.
		System.out.println("Vector Implementation");
		// Declaring the Vector
		Vector v = new Vector();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			v.add(i);

		// Printing elements
		System.out.println(v);

		// Remove element at index 3
		v.remove(3);

		// Displaying the Vector
		// after deletion
		System.out.println(v);

		// Printing elements one by one
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " ");
	}
}