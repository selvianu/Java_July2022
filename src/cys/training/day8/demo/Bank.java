package cys.training.day8.demo;

public class Bank {
	private String name;
	private String branchName;
	private String IFSC;
	private float rateOfInterest;
	private float balance;

	public float savings(Long accountNumber, int depositAmount) {
		balance += depositAmount;
		return balance;

	}

	public void deposits() {
		System.out.println("Parent Class Deposits..");
	}

	public void loan() {
	}
}
