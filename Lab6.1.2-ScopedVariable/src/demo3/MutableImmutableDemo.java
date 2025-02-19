package demo3;

import java.util.stream.IntStream;

public class MutableImmutableDemo {
    // Creating a ScopedValue for shared use across threads
    final static ScopedValue<String> SCOPED_USERNAME = ScopedValue.newInstance();

    // Creating a ThreadLocal variable for individual threads
    private static final ThreadLocal<String> THREAD_LOCAL_USERNAME = ThreadLocal.withInitial(() -> "Default ThreadLocal Value");

    public static void main(String[] args) {
        // Set the ScopedValue to a common value for the scoped context
        String commonScopedValue = "Common User";

        // Create multiple threads using IntStream
        IntStream.range(0, 5).forEach(i -> {
            // If i is less than 2, use ScopedValue
            if (i < 2) {
                Thread.startVirtualThread(() -> 
                    ScopedValue.runWhere(SCOPED_USERNAME, commonScopedValue, () -> {
                        new Task().runScoped(i); // Pass index for demonstration
                    })
                );
            } else {
                // For other threads, use ThreadLocal
                Thread.startVirtualThread(() -> {
                    // Set a unique ThreadLocal value for demonstration
                    THREAD_LOCAL_USERNAME.set("Thread Local Value " + i);
                    new Task().runThreadLocal(i); // Pass index for demonstration
                });
            }
        });

        // Allow some time for all threads to finish
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Task {
        void runScoped(int index) {
            // Retrieve the ScopedValue
            System.out.println("Thread " + index + " - Scoped Username = " + SCOPED_USERNAME.get());
            // Attempt to modify the ScopedValue (to demonstrate immutability)
            // This line is commented out as it will not work.
            // SCOPED_USERNAME.set("New Value"); // This would cause an error
        }

        void runThreadLocal(int index) {
            // Retrieve the ThreadLocal value
            System.out.println("Thread " + index + " - Thread Local Username (before change) = " + THREAD_LOCAL_USERNAME.get());
            // Modify the ThreadLocal value
            THREAD_LOCAL_USERNAME.set("Modified Thread Local Value " + index);
            System.out.println("Thread " + index + " - Thread Local Username (after change) = " + THREAD_LOCAL_USERNAME.get());
        }
    }
}
