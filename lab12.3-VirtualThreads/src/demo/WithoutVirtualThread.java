package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class WithoutVirtualThread {

	public static void main(String[] args) {


		final LongAdder adder = new LongAdder();
        Runnable task = () -> {
            try {
                Thread.sleep(10);
                System.out.println("I'm running in thread " + Thread.currentThread());
                adder.increment();
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
        };
        long start = System.nanoTime();
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            IntStream.range(1, 10000)
                    .forEach(number -> executorService.submit(task));
        }
        long end = System.nanoTime();
        System.out.println("Completed " + adder.intValue() + " tasks in " + (end - start)/1000000 + "ms");
        

	}

}
