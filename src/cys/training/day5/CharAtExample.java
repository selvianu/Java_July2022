package cys.training.day5;

public class CharAtExample {

	public static void main(String[] args) {

		String name = "Umbrella";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'l') {
				count++;
				// System.out.println("Char is present");
			} else
				System.out.println("Char is not present");
		}
		System.out.println(count);
	}

}
