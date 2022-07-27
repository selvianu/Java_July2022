package cys.training.day8.demo;

public class Bank {
	public String customerId;
	public int balance;

	public Bank(String customerId, int balance) {
		this.customerId = customerId;
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}

	public void withdrawal(int amount) {
		this.balance = this.balance + amount - 5;
	}

	@Override
	public String toString() {
		return "Bank [customerId=" + customerId + ", balance=" + balance + "]";
	}

}