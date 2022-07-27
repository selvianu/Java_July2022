package cys.training.day8.demo;

public class IndianBank extends RBI {

	int rateOfInterest = 5;
	int balance = 5000;

	public void deposit(String accountNumber, int amount) {
		// super keyword - variable
		System.out.println("deposited" + balance + rateOfInterest);
		System.out.println("deposited" + ((balance + amount) + super.rateOfInterest));
	}

	public void welcomeMessage() {
		System.out.println("Welcome user.");
		
		//super keyword - method
		super.welcomeMessage();

	}
}
