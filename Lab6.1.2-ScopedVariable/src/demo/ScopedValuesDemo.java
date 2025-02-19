package demo;

public class ScopedValuesDemo {

    public static void main(String[] args) throws InterruptedException {
        ScopedValue.runWhere(Task.VALUE, "testing", () ->  new Task().doStuff());
    }
}

class Task  {

    final static ScopedValue<String> VALUE = ScopedValue.newInstance();

    public void doStuff() {
        System.out.println("VALUE = " + VALUE.get());
    }
    
    
}