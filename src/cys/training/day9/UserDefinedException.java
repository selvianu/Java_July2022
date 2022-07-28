package cys.training.day9;

public class UserDefinedException extends Exception {

	private static int accno[] = { 1001, 1002, 1003, 1004 };

	private static String name[] = { "Nish", "Shubh", "Sush", "Abhi", "Akash" };

	private static double bal[] = { 10000.00, 120.00, 5600.0, 999.00, 1100.55 };

	UserDefinedException() {
	}

	UserDefinedException(String message) {
		System.out.println("User defined exeption");
	}

	public static void main(String args[]) {
		try
		{
			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			for (int i = 0; i < 5; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
				if (bal[i] < 1000) {
					UserDefinedException exception = new UserDefinedException("Balance is less than 1000");
					throw exception;
				}
			}
		} 

		catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		}

	}
}
	