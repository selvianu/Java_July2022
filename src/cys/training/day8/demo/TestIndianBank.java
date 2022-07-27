package cys.training.day8.demo;

public class TestIndianBank {

	public static void main(String[] args) {

		IndianBank ib = new IndianBank();
		ib.deposit("i56789", 5000);
		ib.welcomeMessage();
		IOB iob=new IOB();
		iob.loans();
	}

}
