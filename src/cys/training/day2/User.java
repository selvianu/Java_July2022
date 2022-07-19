package cys.training.day2;

import java.util.*;

public class User {
	// public static String name;
//	public static int noOfUsers;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of user");
		int noOfUsers = s.nextInt();
		for (int i = 1; i <= noOfUsers; i++) {
			System.out.println("Enter user name");
			String name = s.next();
			System.out.println(name);
		}
	}
}