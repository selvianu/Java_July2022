package cys.training;

import java.util.Scanner;

/*
 * A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.

 * 
 */
public class Shop {

	public String name;
	public float price, totalCost;
	public int quantity;
	Scanner s = new Scanner(System.in);

	public Shop() {

	}

	public Shop(String name, float price, int quantity) {

		totalCost = price * quantity;
		if (quantity > 1000) {
			totalCost = (totalCost / 1000) * 100;
			System.out.println(price);
		}
	}
}
