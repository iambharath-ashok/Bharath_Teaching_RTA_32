package javatraining.day7.exceptions.finallyexamples;

public class FinallyResourceCleanup {
    public static void main(String[] args) {
        ResourceLock lock = new ResourceLock();
        try {
            lock.acquire();
            // Perform some operations on the locked resource
        } catch (Exception e) {
            System.out.println("Error during operations: " + e);
        } finally {
            lock.release(); // Release the lock in the finally block
        }
    }
}

class ResourceLock {
    void acquire() {
        System.out.println("Lock acquired");
    }

    void release() {
        System.out.println("Lock released");
    }
}
