package cys.training.day8.demo;

public class BBank extends ABank {

	public boolean pensionScheme(int age) {
		if (age < 60) {
			System.out.println("eligible");
			return false;
		} else {
			System.out.println("Not eligible");
			return true;
		}
	}

	public void deposits() {
		int noOfDays = 0, amount;
		if (noOfDays > 91) {
			System.out.println("ROI = 5.5%");
		} else
			System.out.println("ROI : 5.0%");
	}
}
