package cys.training.day6;

public class ExampleOverLoading {

	public String name;
	public int age;
	public boolean extraCurricularActivity;
	public int grade;

	public int percentageCalculate(int mathsMarks, int scienceMarks, int languageMarks, int socialMarks) {
		System.out.println("Avg of the student");
		return socialMarks;
	}

	public String percentageCalculate(boolean extraCC, String name)

	{
		System.out.println("another method - overlosding");
		return name;

	}

}
