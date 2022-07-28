package cys.training.day8.demo;

import cys.training.day9.userdefinedexception.InvalidAmountException;
import cys.training.day9.userdefinedexception.InvalidDaysException;

public class IOB extends RBI {
	int balance = 1000;

	public void loans() {
		super.welcomeMessage();
	}

	public void fixedDeposit(int amount, int noOfDays) {
		int roi = super.rateOfInterest;

		roi = roi + 10;
		try {
			if (amount < 10) {
				InvalidAmountException invalidAmount = new InvalidAmountException();
				throw invalidAmount;
			}
			// balance = (balance + amount) * roi;

			System.out.println(balance);
		} catch (InvalidAmountException invalidAmount) {
			invalidAmount.printStackTrace();

		}
		try {
			if (noOfDays < 1) {
				InvalidDaysException ie = new InvalidDaysException();
				throw ie;
			}
			System.out.println(balance);

		} catch (InvalidDaysException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Outside try-catch block");
		}
	}

}
