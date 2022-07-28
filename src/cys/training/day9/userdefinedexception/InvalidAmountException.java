package cys.training.day9.userdefinedexception;

public class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		System.out.println("Amount should be greated than Rs.10/-");
	}
}
