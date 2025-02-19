package demo;

import java.util.concurrent.Flow.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

class SimpleSubscriber implements Subscriber<String> {
    private Subscription subscription;
    private final int batchSize;
    private final long delayInMillis;
    private CompletableFuture<Void> completionSignal;

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
        CompletableFuture.delayedExecutor(delayInMillis, TimeUnit.MILLISECONDS)
            .execute(() -> subscription.request(batchSize));
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("Error: " + throwable.getMessage());
        completionSignal.completeExceptionally(throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("Completed");
        completionSignal.complete(null);
    }
}