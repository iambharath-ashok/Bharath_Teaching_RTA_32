package javatraining.day10.collections.comparableandcomparator.comparator;

import java.util.*;



public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet with different comparators
        TreeSet<Movie> titleSortedSet = new TreeSet<>(new TitleComparator());
        TreeSet<Movie> yearSortedSet = new TreeSet<>(new YearComparator());
        TreeSet<Movie> ratingSortedSet = new TreeSet<>(new RatingComparator());

        // Add movies to the sets
        titleSortedSet.add(new Movie("Inception", 2010, 8.8, "Christopher Nolan", 148));
        titleSortedSet.add(new Movie("The Shawshank Redemption", 1994, 9.3, "Frank Darabont", 142));
        titleSortedSet.add(new Movie("The Matrix", 1999, 8.7, "Lana Wachowski", 136));

        yearSortedSet.addAll(titleSortedSet);
        ratingSortedSet.addAll(titleSortedSet);

        // Print movies in sorted order
        System.out.println("Movies sorted by title:");
        printMovies(titleSortedSet);

        System.out.println("\nMovies sorted by year:");
        printMovies(yearSortedSet);

        System.out.println("\nMovies sorted by rating:");
        printMovies(ratingSortedSet);
    }

    public static void printMovies(Set<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

/*class TitleComparator implements Comparator<Movie> {
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
}*/
