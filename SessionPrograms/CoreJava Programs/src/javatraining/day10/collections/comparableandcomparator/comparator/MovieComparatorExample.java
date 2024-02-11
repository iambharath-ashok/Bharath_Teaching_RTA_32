package javatraining.day10.collections.comparableandcomparator.comparator;

import java.util.*;

class Movie {
    private String title;
    private int year;
    private double rating;
    private String director;
    private int durationMinutes;

    public Movie(String title, int year, double rating, String director, int durationMinutes) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return title + " (" + year + "), Rating: " + rating + ", Director: " + director + ", Duration: " + durationMinutes + " minutes";
    }
}

public class MovieComparatorExample {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010, 8.8, "Christopher Nolan", 148));
        movies.add(new Movie("The Shawshank Redemption", 1994, 9.3, "Frank Darabont", 142));
        movies.add(new Movie("The Matrix", 1999, 8.7, "Lana Wachowski", 136));

        // Sort movies using different comparators
        Collections.sort(movies, new TitleComparator());
        System.out.println("Sorted by Title:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();

        Collections.sort(movies, new YearComparator());



        System.out.println("Sorted by Year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();

        Collections.sort(movies, new RatingComparator());
        System.out.println("Sorted by Rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        //Java 8
        Collections.sort(movies, (m1, m2) -> Integer.compare(m1.getYear(), m2.getYear()));
        Collections.sort(movies, (m1, m2) -> Integer.compare(m1.getDurationMinutes(), m2.getDurationMinutes()));
        Collections.sort(movies, Comparator.comparingInt(Movie::getDurationMinutes));
    }
}

class TitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }
}

class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getYear(), m2.getYear());
    }
}

class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating());
    }
}
