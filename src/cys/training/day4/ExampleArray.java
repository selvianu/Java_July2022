package cys.training.day4;

import java.util.Iterator;

/*
 * Create Array
Initialize Array
Iterate Array
Array Length
Search item in Array
Sorting items in Array
 */
public class ExampleArray {
	public static void main(String args[]) {
//array declaration -  3 ways

		int no1[];
		no1 = new int[10];

		int no3[] = { 45, 2, 78 };
		// no[0]=5;
		int no2[] = new int[5];// declaration and instantiation
		no2[0] = 45;
		no2[1] = 90;
		no2[4] = 76;
		for (int i = 0; i < no3.length; i++) {
			System.out.println(no3[i]);
		}

		/*
		 * for(data_type variable:array){ //body of the loop }
		 * 
		 */
		
		for (int newArr : no3) {
			System.out.println(newArr);
		}
		for (int i : no2) {
			System.out.println("foreach" + i);
		}
	}
}