package demo;

import java.util.concurrent.Flow.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

class SimpleSubscriber implements Subscriber<String> {
    private Subscription subscription;
    private final int batchSize;
    private final long delayInMillis;
    private CompletableFuture<Void> completionSignal;
    private volatile boolean errorOccurred = false;

    public SimpleSubscriber(int batchSize, long delayInMillis, CompletableFuture<Void> completionSignal) {
        this.batchSize = batchSize;
        this.delayInMillis = delayInMillis;
        this.completionSignal = completionSignal;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        // Request the first batch
        subscription.request(batchSize);
    }

    @Override
    public void onNext(String item) {
        System.out.println("Received: " + item);

        // Introduce a delay between batches (for demonstration purposes)
        CompletableFuture<Void> delayedTask = CompletableFuture.runAsync(() -> {
            try {
                // Simulate an error for demonstration purposes
                if (item.equals("Item 5")) {
                    throw new RuntimeException("Simulated error for Item 5");
                }
                // Process the item
            } catch (Exception e) {
                onError(e);
            }
        });

        // Wait for the delayed task to complete (synchronously)
        delayedTask.join();

        // Check if an error has occurred
        if (!errorOccurred) {
            // Request the next batch only if no error has occurred
            subscription.request(batchSize);
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("Error: " + throwable.getMessage());
        completionSignal.completeExceptionally(throwable);
        errorOccurred = true;

        // Cancel the subscription to prevent further requests
        // By adding subscription.cancel() in the onError method, we explicitly cancel the subscription 
        // when an error occurs. This should prevent the subscriber from requesting and processing 
        // additional items after an error.
       // subscription.request(1);
     //   subscription.cancel();
    }

    @Override
    public void onComplete() {
        System.out.println("Completed");
        completionSignal.complete(null);
    }
}