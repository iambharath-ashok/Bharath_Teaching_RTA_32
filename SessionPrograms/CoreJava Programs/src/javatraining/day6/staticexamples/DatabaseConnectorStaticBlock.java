package javatraining.day6.staticexamples;

public class DatabaseConnectorStaticBlock {
    public static void main(String[] args) {
        // Access the connection pool without explicitly calling the static block
        DatabaseConnectionPool pool = DatabaseManager.getConnectionPool();
        // Use the connection pool for database operations
        // ...
    }
}
