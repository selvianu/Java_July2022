package cys.training.day5;

public class StringEquity {

	public static void main(String[] args) {
		String s1 = new String("hi");
		String s2 = "bye";
		System.out.println(s2==s1);

		String s3 = "hi";
		s2 = s1;
		System.out.println(s1==s3);//if two strings refer to the same object
		System.out.println(s2.equals(s3));// if two strings objects have the same characters in the same order.
		System.out.println(s2==s1);
	}

}
