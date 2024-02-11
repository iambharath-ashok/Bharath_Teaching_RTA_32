package javatraining.day10.collections.maps.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

class MovieTicketBookingSystem {
    private ConcurrentHashMap<String, ConcurrentHashMap<Integer, Integer>> availableSeats;

    public MovieTicketBookingSystem() {
        // Initialize the available seats for a single movie with different seating rows
        availableSeats = new ConcurrentHashMap<>();

        // Specify the number of rows and seats per row for Movie1
        int numRows = 5;
        int seatsPerRow = 10;

        // Initialize the available seats for each row
        for (int row = 1; row <= numRows; row++) {
            ConcurrentHashMap<Integer, Integer> rowSeats = new ConcurrentHashMap<>();
            for (int seat = 1; seat <= seatsPerRow; seat++) {
                rowSeats.put(seat, 1); // 1 represents an available seat
            }
            availableSeats.put("Movie1_Row" + row, rowSeats);
        }
    }

    public void bookTicket(String movie, int row, int seat) {
        // Use compute method to safely update the available seats
        availableSeats.computeIfPresent(movie, (movieKey, rowSeats) -> {
            Integer seatStatus = rowSeats.get(seat);
            if (seatStatus == null || seatStatus == 0) {
                // Seat not found or already booked
                System.out.println("Sorry, cannot book ticket for " + movie + " Row " + row + ", Seat " + seat +
                        ". Seat not available.");
                return rowSeats;
            } else {
                // Book the ticket
                System.out.println("Booking ticket for " + movie + " Row " + row + ", Seat " + seat);
                rowSeats.put(seat, 0); // 0 represents a booked seat
                return rowSeats;
            }
        });
    }

    public int getAvailableSeats(String movie, int row, int seat) {
        // Use get method to safely read the available seats
        return availableSeats.getOrDefault(movie, new ConcurrentHashMap<>())
                .getOrDefault(seat, -1);
    }

    public void displayAvailableSeats() {
        // Display the current available seats for all rows in all movies
        System.out.println("Available Seats:");
        availableSeats.forEach((movie, rows) -> {
            System.out.println(movie + ":");
            rows.forEach((row, seats) -> System.out.println("  Row " + row + ": " + seats));
        });
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicketBookingSystem bookingSystem = new MovieTicketBookingSystem();

        // Simulate multiple users trying to book tickets and check available seats concurrently
        Runnable bookingTask1 = () -> {
            bookingSystem.bookTicket("Movie1_Row1", 1, 3);
            int availableSeats = bookingSystem.getAvailableSeats("Movie1_Row1", 1, 3);
            System.out.println("Available seats for Movie1_Row1, Seat 3: " + availableSeats);
        };

        Runnable bookingTask2 = () -> {
            bookingSystem.bookTicket("Movie1_Row2", 2, 5);
            int availableSeats = bookingSystem.getAvailableSeats("Movie1_Row2", 2, 5);
            System.out.println("Available seats for Movie1_Row2, Seat 5: " + availableSeats);
        };

        // Simulate multiple users checking available seats concurrently
        Runnable checkAvailableSeatsTask1 = () -> {
            int availableSeats = bookingSystem.getAvailableSeats("Movie1_Row1", 1, 3);
            System.out.println("Available seats for Movie1_Row1, Seat 3 (read): " + availableSeats);
        };

        Runnable checkAvailableSeatsTask2 = () -> {
            int availableSeats = bookingSystem.getAvailableSeats("Movie1_Row2", 2, 5);
            System.out.println("Available seats for Movie1_Row2, Seat 5 (read): " + availableSeats);
        };

        // Run the tasks concurrently
        Thread thread1 = new Thread(bookingTask1);
        Thread thread2 = new Thread(bookingTask2);
        Thread thread3 = new Thread(checkAvailableSeatsTask1);
        Thread thread4 = new Thread(checkAvailableSeatsTask2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final available seats for all rows in all movies
        bookingSystem.displayAvailableSeats();
    }
}
