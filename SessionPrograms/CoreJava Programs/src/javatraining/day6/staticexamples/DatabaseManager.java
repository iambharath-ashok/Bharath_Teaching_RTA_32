package javatraining.day6.staticexamples;



public class DatabaseManager {
    private static DatabaseConnectionPool connectionPool;

    static {
        // Perform initialization tasks
        connectionPool = DatabaseConnectionPoolLibrary.createConnectionPool();
        System.out.println("Database connection pool initialized");
    }

    public static DatabaseConnectionPool getConnectionPool() {
        return connectionPool;
    }

    // Other methods for database operations
    // ...
}

