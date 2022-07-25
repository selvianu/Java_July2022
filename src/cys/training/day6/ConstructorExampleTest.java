package cys.training.day6;

public class ConstructorExampleTest {

	public static void main(String[] args) {
//Default Constructor
		ConstructorExample ex = new ConstructorExample();
		System.out.println(ex.name);
		System.out.println(ex.gender);
		System.out.println(ex.eligible);
		// Parameterized Constructor
		ConstructorExample ex1 = new ConstructorExample("Priya", false);
		System.out.println(ex1);
		// Constructor Overloading
		ConstructorExample ex3 = new ConstructorExample("Sita", 'f');
		System.out.println(ex3);

		

	}

}
