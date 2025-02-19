package demo;

public class ExampleThreadLocal {
    private static final ThreadLocal<String> threadLocalVariable = new ThreadLocal<>();

    public static void main(String[] args) {
        // Set values for different threads
        threadLocalVariable.set("Value for main 1");
        new Thread(() -> {
            threadLocalVariable.set("Value for Thread 1");
            System.out.println("Thread 1: " + threadLocalVariable.get());
        }).start();

        new Thread(() -> {
            threadLocalVariable.set("Value for Thread 2");
            System.out.println("Thread 2: " + threadLocalVariable.get());
        }).start();

        // Accessing the value in the main thread
        System.out.println("Main Thread: " + threadLocalVariable.get());
    }
}
