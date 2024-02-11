package javatraining.day10.collections.comparableandcomparator.comparator.treeset;

import java.util.*;

class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }
}

public class ComparatorThenComparingExample {
    public static void main(String[] args) {
        Comparator<Movie> titleComparator = Comparator.comparing(Movie::getTitle);
        Comparator<Movie> yearComparator = Comparator.comparing(Movie::getYear);

        Comparator<Movie> titleThenYearComparator = titleComparator.thenComparing(yearComparator);

        TreeSet<Movie> movies = new TreeSet<>(titleThenYearComparator);
        movies.add(new Movie("Inception", 2010));
        movies.add(new Movie("The Matrix", 1999));
        movies.add(new Movie("Inception", 2002));

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
