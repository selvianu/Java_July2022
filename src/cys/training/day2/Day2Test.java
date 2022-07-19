package cys.training.day2;

public class Day2Test {

	public static void main(String[] args) {

		Variables v = new Variables();// Instance Variable
		// v.city = "Trichy";
		Variables.city = "Trichy";// static variables//className.variablename

		System.out.println(Variables.city);

		// v.nationality = "NRI";
		System.out.println(v.nationality);

//ternary operator
		String eligibility = (v.nationality == "Indian") ? "Eligible" : "non eligiblSe";
		System.out.println(eligibility);

		// switch
		switch (eligibility) {
		case "Indian":

			System.out.println("Executable Code");
			break;
		default:
			System.out.println("A Soul");
		}

	}

}
