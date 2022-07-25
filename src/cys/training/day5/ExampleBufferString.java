package cys.training.day5;

public class ExampleBufferString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		// instead of concat() - String class using append()
		sb.append("welcome");
		
		System.out.println(sb);
		
		sb.append("user");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder();
		sb1.append(1099);
		System.out.println(sb1);
		sb1.append("Park Avenue");
		System.out.println(sb1);
		String name = new String(sb);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String fName = "Mahesh";
		StringBuffer sb2 = new StringBuffer(fName);
		sb2.delete(2, 4);
		System.out.println(sb2);
		sb2.setLength(20);
		int capacity = sb2.capacity();
		System.out.println(capacity);
		int length = sb2.length();
		System.out.println(length);
System.out.println(sb2);
	}

}
