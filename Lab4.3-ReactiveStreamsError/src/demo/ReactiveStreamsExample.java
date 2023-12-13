package demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.SubmissionPublisher;



public class ReactiveStreamsExample {
    public static void main(String[] args) {
        // Create a simple Publisher
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        // Configuration for the Subscriber
        int batchSize = 1;
        long delayInMillis = 1000; // 1 second
        CompletableFuture<Void> completionSignal = new CompletableFuture<>();

        // Create a Subscriber with configurable batch size and delay
        SimpleSubscriber subscriber = new SimpleSubscriber(batchSize, delayInMillis, completionSignal);

        // Subscribe the Subscriber to the Publisher
        publisher.subscribe(subscriber);

        // Publish more items
        for (int i = 1; i <= 10; i++) {
            publisher.submit("Item " + i);
        }

        // Introduce a delay to ensure processing is completed
        try {
            Thread.sleep(10000); // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the publisher (this will trigger onComplete for the subscriber)
        publisher.close();

        // Wait for the completion signal
        completionSignal.join();
    }
}