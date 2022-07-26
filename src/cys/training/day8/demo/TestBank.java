package cys.training.day8.demo;

public class TestBank {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.deposits();
		System.out.println(bank.savings(345677623l, 34000));
		ABank banka = new ABank();
		banka.deposits();// method of parent class
		float savings = banka.savings(9889876534l, 56700);// method of parent class
		System.out.println(savings);
		banka.jewelLoan();// method of child1 class
		BBank bankb = new BBank();
		bankb.savings(765434567l, 120000);
		boolean pensionScheme = bankb.pensionScheme(66);

	}

}
