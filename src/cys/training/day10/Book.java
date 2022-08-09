package cys.training.day10;

public class Book {
	//protected
	private String name;
	protected String author;
	public int price;
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}
