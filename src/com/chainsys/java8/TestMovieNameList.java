package com.chainsys.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Example 3 : using streams.map method
public class TestMovieNameList {

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

		
		System.out.println("##### 2. Display Movie names ######");
		// select name from movies; vs select * from movies
		
		//without using streams
		List<String> movieNames = new ArrayList<String>();
		for (Movie movie : movieList) {
			movieNames.add(movie.title);
		}
		
		//Using Streams - map method
		List<String> movieNameList = movieList.stream().map(m -> m.title).collect(Collectors.toList());
		System.out.println(movieNameList);
	}
}
