package demo;


import java.util.Random;

public class VirtualThreadLog {
    public static void main(String[] args) throws InterruptedException {
        boolean vThreads = true; // Set to true to use virtual threads
        System.out.println("Using vThreads: " + vThreads);

        long start = System.currentTimeMillis();

        Random random = new Random();
        Runnable runnable = () -> {
            double i = random.nextDouble(1000) % random.nextDouble(1000);
            Thread currentThread = Thread.currentThread();
            // Print thread details
            System.out.println("Thread Name: " + currentThread.getName() +
                               ", ID: " + currentThread.getId() +
                               ", State: " + currentThread.getState() +
                               ", Is Virtual: " + currentThread.isVirtual());
        };

        for (int i = 0; i < 100; i++) {
            if (vThreads) {
                Thread.ofVirtual().start(runnable);
            } else {
                Thread t = new Thread(runnable);
                t.start();
            }
        }

      
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Run time: " + timeElapsed);
        Thread.sleep(1000);
    }
}

