package demo;

	import java.util.ArrayList;
	import java.util.List;
import java.util.concurrent.ForkJoinPool;
	
	public class TestStreamWithParallelLog {
	
		 public static void main(String[] args) {

		        long currentTime = System.currentTimeMillis();
		        List<Integer> data = new ArrayList<>();
		        for (int i = 0; i < 10000; i++) {
		            data.add(i);
		        }

		        // Display information about the main thread
		        System.out.println("Main Thread: " + Thread.currentThread().getName());

		        // Get the ForkJoinPool for parallel stream
		        ForkJoinPool forkJoinPool = new ForkJoinPool();

		        // Display the parallelism level (number of parallel threads)
		        System.out.println("Parallelism: " + forkJoinPool.getParallelism());

		        long sum = data.parallelStream()
		                .map(i -> (int) Math.sqrt(i))
		                .map(number -> {
		                    // Display information about the current parallel thread
		                    System.out.println("Thread: " + Thread.currentThread().getName());
		                    return performComputation(number);
		                })
		                .reduce(20, Integer::sum);

		        System.out.println(sum);
		        long endTime = System.currentTimeMillis();
		        System.out.println("Time taken to complete: " + (endTime - currentTime) / (1000 * 60) + " minutes");

		    }

		    public static int performComputation(int number) {
		        int sum = 0;
		        for (int i = 1; i < 100; i++) {
		            int div = (number / i);
		            sum += div;
		        }
		        return sum;
		    }
	}
	
	

