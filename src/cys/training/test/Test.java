package cys.training.test;

import cys.training.Book;
import cys.training.Movie;

public class Test {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.name = "JeyJey";
		movie.year = 2000;

		System.out.println(movie.name);
		System.out.println(movie.year);
	}

}
