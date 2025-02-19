package demo2;

import java.util.concurrent.Executors;

public class ScopedValuesExample {
    // Creating a ScopedValue
    final static ScopedValue<String> USERNAME = ScopedValue.newInstance();

    public static void main(String[] args) {
        // Using ScopedValue with a virtual thread
        Thread.startVirtualThread(() ->
            ScopedValue.runWhere(USERNAME, "Surya", () -> new Task().run())
        );

        // Give the thread some time to execute
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Task {
        void run() {
            System.out.println("Username = " + USERNAME.get());
        }
    }
}
