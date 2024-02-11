package javatraining.day6.staticexamples;

public class DatabaseConnectionPool {
    private int maxConnections;
    private int currentConnections;

    public DatabaseConnectionPool(int maxConnections) {
        this.maxConnections = maxConnections;
        this.currentConnections = 0;
    }

    public void acquireConnection() {
        if (currentConnections < maxConnections) {
            currentConnections++;
            System.out.println("Acquired a database connection");
        } else {
            System.out.println("Max connections reached. Waiting...");
        }
    }

    public void releaseConnection() {
        if (currentConnections > 0) {
            currentConnections--;
            System.out.println("Released a database connection");
        } else {
            System.out.println("No connections to release");
        }
    }
}

class DatabaseConnectionPoolLibrary {
    public static DatabaseConnectionPool createConnectionPool() {
        // Simulate creating and returning a connection pool
        return new DatabaseConnectionPool(10); // Maximum 10 connections
    }
}
