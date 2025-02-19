package demo2;

public class ThreadLocalExample {
    // Creating a ThreadLocal variable
    private static final ThreadLocal<String> USERNAME = ThreadLocal.withInitial(() -> "Default Username");

    public static void main(String[] args) {
        // Using ThreadLocal with a virtual thread
        Thread.startVirtualThread(() -> {
           // USERNAME.set("Surya");  // Set the username for this thread
            new Task().run();        // Execute the task that uses the ThreadLocal value
        });

        // Give the thread some time to execute
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Task {
        void run() {
            // Retrieve the ThreadLocal value
            System.out.println("Username = " + USERNAME.get());
        }
    }
}
