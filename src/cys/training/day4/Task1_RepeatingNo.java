package cys.training.day4;

public class Task1_RepeatingNo {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 2, 0, 2, 0, 2, 3, 8, 2, 9, 2, 3 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i] % arr.length;
			arr[num] += arr.length;
		}

		int result = -1;
		int maxcount = 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] / arr.length > maxcount) {
				maxcount = arr[i] / arr.length;
				result = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			arr[i] %= arr.length;
		}

	}

}
