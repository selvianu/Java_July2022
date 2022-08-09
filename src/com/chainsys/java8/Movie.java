package com.chainsys.java8;

public class Movie {
	public String title;
	public Integer ratings;
	public Integer year;

	public Movie(String title, Integer ratings, Integer year) {
		this.title = title;
		this.ratings = ratings;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", ratings=" + ratings + ", year=" + year + "]";
	}

}
