package demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadBuilder {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		Thread.Builder builder = Thread.ofVirtual().name("worker-", 0);
		Runnable task = () -> {
		    System.out.println("Thread ID: " + Thread.currentThread().threadId());
		};

		// name "worker-0"
		Thread t1 = builder.start(task);   
		t1.join();
		System.out.println(t1.getName() + " terminated");

		// name "worker-1"
		Thread t2 = builder.start(task);   
		t2.join();  
		System.out.println(t2.getName() + " terminated");
		
		try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
		    Future<?> future = myExecutor.submit(() -> System.out.println("Running thread : " + Thread.currentThread().threadId()));
		    future.get();
		    System.out.println("Task completed");
		    
	}
	}
}
