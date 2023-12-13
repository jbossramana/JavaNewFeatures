package demo;

public class ThreadLocalHandshakeExample {

    public static void main(String[] args) {
        // Creating a simple worker thread
        Thread workerThread = new Thread(() -> {
          
            // Simulate some work
            doWork();

            System.out.println("Worker thread completed.");
        });

        // Start the worker thread
        workerThread.start();
        System.out.println("Worker thread started." + workerThread.getName());

        // Simulate the main thread doing some work
        System.out.println("Main thread doing some work...");

        // At some point, initiate a callback on the worker thread without a global safepoint
        initiateThreadLocalHandshake(workerThread);

        // Simulate the main thread doing more work
        System.out.println("Main thread doing more work...");

        try {
            // Wait for the worker thread to complete
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completed.");
    }

    private static void initiateThreadLocalHandshake(Thread thread) {
        // Simulate initiating a callback on a specific thread without a global safepoint
        // This could involve interacting with JVM internals related to Thread-Local Handshakes
        System.out.println("Initiating Thread-Local Handshake on thread: " + thread.getName());
        // Perform some low-level operations specific to the handshake
        // ...
    }

    private static void doWork() {
        // Simulate the worker thread doing some work
        System.out.println("Worker thread is working...");
        // Simulate some computation
        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }
    }
}
