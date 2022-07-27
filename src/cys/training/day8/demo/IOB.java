package cys.training.day8.demo;

public class IOB extends RBI {
	int balance = 1000;

	public void loans() {
		super.welcomeMessage();
	}

	public void fixedDeposit(int amount, int noOfDays) {
		int roi = super.rateOfInterest;
	
		if (noOfDays > 91) {
			roi = roi + 10;
			try
			{
			balance = balance + amount + roi;
			
			System.out.println(balance);
			}
			catch(Exception e)
			{
				//
				e.printStackTrace();
			}
		}
	}
}
