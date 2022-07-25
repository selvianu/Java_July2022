package cys.training.day6;

public class TestClass {

	public static void main(String[] args) {

		ExampleOverLoading e1 = new ExampleOverLoading();
		e1.percentageCalculate(67, 89, 100, 9);
		e1.percentageCalculate(true, "Arun");
		e1.percentageCalculate(false, null);
			}

}
