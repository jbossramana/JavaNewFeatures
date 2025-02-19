package demo;

public class ScopedValuesDemo2 {

    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() ->
                ScopedValue.runWhere(
                        Task.VALUE, "testing", () -> new Task2().doStuff()
                ));

        Thread.sleep(100);
    }
}

class Task2  {

    final static ScopedValue<String> VALUE = ScopedValue.newInstance();

    public void doStuff() {
        System.out.println("VALUE = " + VALUE.get());
        
        // Creating a scope inside another scope
        Thread.startVirtualThread(() ->
                ScopedValue.runWhere(
                        Task2.VALUE, "Inside the Thread", () -> new Task2().someOtherTask()
                ));

        someOtherTask(); // current scope

    }

    public void someOtherTask(){
        System.out.println("VALUE = " + VALUE.get());
    }

}
