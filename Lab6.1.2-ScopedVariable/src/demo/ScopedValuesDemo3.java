package demo;

import java.util.concurrent.StructuredTaskScope;

public class ScopedValuesDemo3 {

    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() ->
                ScopedValue.runWhere(
                        Task.VALUE, "testing", () -> new Task3().someOtherTask()
                ));

        Thread.sleep(100);
    }
}

class Task3  {

    final static ScopedValue<String> VALUE = ScopedValue.newInstance();

    public void someOtherTask(){

        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            scope.fork(() -> new SubTask().runSubtask());
            scope.fork(() -> new SubTask().runSubtask());
            scope.fork(() -> new SubTask().runSubtask());

            scope.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class SubTask{

    String runSubtask() {
        String ScopedValue = Task.VALUE.get();
        System.out.println("Inherited value = " + ScopedValue);
        return ScopedValue;
    }

}
