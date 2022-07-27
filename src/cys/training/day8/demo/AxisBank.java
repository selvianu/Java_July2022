package cys.training.day8.demo;

public class AxisBank extends Bank {

	public AxisBank(String customerId, int balance) {
		super(customerId, balance);
	}
	public void withdrawal(int amount) {
		this.balance = this.balance + amount - 10;
	}

}
