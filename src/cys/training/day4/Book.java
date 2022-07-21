package cys.training.day4;

public class Book {

	public String name;
	public String author;
	public int price;
	
	public Book(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}


	
	}