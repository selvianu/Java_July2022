package cys.training.day8.demo;

public class TestBank {

	public static void main(String[] args) {
/*
		Bank bank = new Bank("b5678", 8000);
		System.out.println("Before deposit : " + bank);
		bank.deposit(6000);
		System.out.println("After deposit : " + bank);
		System.out.println("Before withdrawal" + bank);
		bank.withdrawal(200);
		System.out.println("After withdrawal" + bank);

		AxisBank axis = new AxisBank("ax8966", 50000);
		System.out.println(axis);
		System.out.println("Before withdrawal" + axis);
		axis.withdrawal(2000);
		System.out.println("After withdrawal" + axis);*/
		
		IOB iob=new IOB();
		iob.fixedDeposit(200, 8);
		
	}
}