package cys.training.day8.demo;

public class TestUniversity {

	public static void main(String[] args) {

		University university = new University();
		university.eligible();
		AnnaUniversity annaUniv = new AnnaUniversity();
		annaUniv.eligible();
		annaUniv.techSeminar();
	}

}
