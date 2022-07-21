package cys.training.day4;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the
 * longest sequence in strictly ascending order. Print the elements of longest
 * ascending sequence in an array Elements of the sequence must go one after
 * another. A single number is assumed to be an ordered sequence with the length
 * = 1.
 */

public class longestAscendingSequence {

	public static void main(String[] args) {

		// Read elements and size
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int tam = scanner.nextInt();
		System.out.println("Enter " + tam + " numbers in any order to find the longest ascending sequence");
		int[] numbers = new int[tam];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Defining auxiliary variables

		int maxTmp = 0;
		int count = 1;
		int pos = -1;

		// Traverse the array and increment the amount by 1 the longest amount in the
		// array, in addition to obtaining the position
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < numbers[i + 1]) {
				++count;
			} else {
				if (count > maxTmp) {
					maxTmp = count;
					pos = i;
				}
				count = 1;
			}
		}

		// Check if count or maxTemp is the highest to assign the position from which
		// the numbers will start printing
		if (maxTmp > count) {
			pos = (pos - maxTmp);
		}

		// Get max value
		int max = Math.max(count, maxTmp);
		System.out.println("The max value is : " + max);

		// Print elements
		System.out.println(max + "numbers in ascending order");
		for (int i = pos + 1; i <= pos + max; i++) {

			System.out.print(numbers[i] + " ");
		}

		scanner.close();
	}

}