package cys.training;

public class TechBooks extends Book {

	public static void main(String[] args) {

		TechBooks javaBook = new TechBooks();
		javaBook.author = "Allen";
		javaBook.price = 200;

		System.out.println(javaBook);
	}

}
