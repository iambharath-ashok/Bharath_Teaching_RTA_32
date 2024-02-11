package javatraining.day7.exceptions.assignments;

import java.io.IOException;

class NetworkConnection1 extends Exception {
    public NetworkConnection1(String message, Throwable cause) {
        super(message, cause);
    }

    static class RemoteServerSystem {
        public void ConnectToServer() throws NetworkConnection1 {
            try {
                throw new IOException("Unable to establish a network connection");
            } catch (IOException e) {
                throw new NetworkConnection1("Error connecting to the remote server", e);
            }
        }
    }

    public static class NetworkConnection {
        public static void main(String[] args) {
            // Test your network connection method here
            RemoteServerSystem system = new RemoteServerSystem();

            try {
                system.ConnectToServer();
            } catch (NetworkConnection1 e) {
                System.out.println("Custom Error message: " + e.getMessage());
                System.out.println("Chained Exception:");
                e.printStackTrace();
            }
        }
    }
}
