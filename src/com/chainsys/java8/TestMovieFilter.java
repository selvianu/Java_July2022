package com.chainsys.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Example 4 : using streams.filter and map method
public class TestMovieFilter {

	public static void main(String[] args) {

		List<Movie> movieList = new ArrayList<Movie>();
		Movie m1 = new Movie("Kabali", 4, 2020);
		Movie m2 = new Movie("Robo", 3, 2010);
		Movie m3 = new Movie("Basha", 5, 2000);
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);

		System.out.println("##### 1. Display All Movies ######");

		for (Movie movie : movieList) {
			System.out.println("Title:" + movie.title + ",ratings=" + movie.ratings + ",Year=" + movie.year);
		}

		System.out.println("##### 4. Display Movie names released after 2010 ######");
		// select name from movies where year >= 2010;

		// without using streams
		List<String> movieNames = new ArrayList<String>();
		for (Movie movie : movieList) {
			if (movie.year > 2020)
				movieNames.add(movie.title);
		}

		// Using Streams
		List<String> filteredMovieNameList = movieList.stream().filter(m -> m.year >= 2010).map(m -> m.title)
				.collect(Collectors.toList());
		System.out.println(filteredMovieNameList);
	}
}
