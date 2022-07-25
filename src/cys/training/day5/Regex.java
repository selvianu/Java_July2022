package cys.training.day5;

import java.util.regex.Pattern;

/*
 * Pattern Class - Defines a pattern (to be used in a search)	
Matcher Class - Used to search for the pattern
 */
public class Regex {

	public static void main(String[] args) {
		boolean matches = Pattern.matches("selvi", "SelVI");
		String name="Testing";
		
		System.out.println(matches);
		
	}

}
