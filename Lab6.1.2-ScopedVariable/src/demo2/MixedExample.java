package demo2;

import java.util.concurrent.Executors;

public class MixedExample {
    // Creating a ScopedValue for shared use across threads
    final static ScopedValue<String> SCOPED_USERNAME = ScopedValue.newInstance();
    
    // Creating a ThreadLocal variable for one specific thread
    private static final ThreadLocal<String> THREAD_LOCAL_USERNAME = ThreadLocal.withInitial(() -> "Default ThreadLocal Value");

    public static void main(String[] args) {
        // Create a virtual thread that uses the ScopedValue
        Thread.startVirtualThread(() ->
            ScopedValue.runWhere(SCOPED_USERNAME, "Surya", () -> {
                new Task().run(); // Run task that accesses the scoped value
            })
        );

        // Create a separate virtual thread that uses the ThreadLocal variable
        Thread.startVirtualThread(() -> {
            THREAD_LOCAL_USERNAME.set("Thread Local Value");
            new Task().runThreadLocal(); // Run task that accesses the ThreadLocal value
        });

        // Give the threads some time to execute
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Task {
        void run() {
            // Retrieve the ScopedValue
            System.out.println("Scoped Username = " + SCOPED_USERNAME.get());
        }

        void runThreadLocal() {
            // Retrieve the ThreadLocal value
            System.out.println("Thread Local Username = " + THREAD_LOCAL_USERNAME.get());
        }
    }
}
