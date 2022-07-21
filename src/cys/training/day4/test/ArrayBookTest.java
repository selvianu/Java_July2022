package cys.training.day4.test;

import java.util.Arrays;

import cys.training.day4.Book;

public class ArrayBookTest {

	public static void main(String[] args) {
		Book[] books = new Book[5];// array of objects
		//Book book=new Book();
	//	books.name="";
		books[0] = new Book("Java", "McGraw", 500);
		books[1] = new Book("HTML", "McGraw", 500);
		books[2] = new Book("J2EE", "McGraw", 500);
		books[3] = new Book("HTML", "McGraw", 500);
		books[4] = new Book("HTML", "McGraw", 500);
		

		System.out.println("Using for loop");
		for (int i = 0; i < books.length; i++) {
			Book book = books[i];
		//System.out.println("Book : " + book.author + " Price : " + book.price);
			System.out.println(book);
		}
		System.out.println("Using foreach");
		for (Book book : books) {

			System.out.println(book);
		}

		
		int arr[] = { 80, 98, 108, 10, 20, 15, 22, 35 };

		 Arrays.sort(arr);
		for (int i : arr) {
			System.out.println("sorting" + i);
		}

		int key = 80;

		// Print the key and corresponding position
		//System.out.println(key + " found at position = " + Arrays.binarySearch(arr, key));// differs on sort
	
		int position = Arrays.binarySearch(arr, 10);
		System.out.println(position+"is in the position");
		
		int[] copyOf = Arrays.copyOf(arr, 10);// increase size of array
	//	Arrays.
//check out other methods of Array

	}

}
