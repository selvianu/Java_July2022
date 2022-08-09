package com.chainsys.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Example 1 : using streams.filter method
public class TestMovieList {

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

		System.out.println("##### 2. Display Movies released after 2010 ");
		// Without using Streams,
		// 1) we need to iterate and
		// 2)check condition
		// 3) store matched value in another list
		
		// SQL: select * from movies where year >= 2010;
		List<Movie> filteredMovies = new ArrayList<Movie>();
		for (Movie movie : movieList) {
			if (movie.year >= 2010) {
				filteredMovies.add(movie);
			}
		}
		System.out.println(filteredMovies);

		//using streams
		List<Movie> filteredMoviesUsingStream = movieList.stream().filter(m -> m.year >= 2010)
				.collect(Collectors.toList());
		System.out.println(filteredMoviesUsingStream);

	}
}
