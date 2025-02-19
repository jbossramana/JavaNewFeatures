package demo;


import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class WithVirtualThread {

    public static void main(String[] args) {

        final LongAdder adder = new LongAdder();
        Runnable task = () -> {
            try {
                Thread.sleep(10);
                System.out.println("I'm running in thread " + Thread.currentThread());
                adder.increment();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Properly handle the interruption
            }
        };

        long start = System.nanoTime();
        try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(1, 10000)
                    .forEach(number -> executorService.submit(task));
        }
        long end = System.nanoTime();
        System.out.println("Completed " + adder.intValue() + " tasks in " + (end - start) / 1_000_000 + "ms");
    }
}
