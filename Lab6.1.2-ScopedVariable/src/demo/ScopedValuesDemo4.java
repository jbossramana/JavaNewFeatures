package demo;

public class ScopedValuesDemo4 {

    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() ->
                ScopedValue.runWhere(
                        CurrentUser.USERNAME, "Surya", TaskDefinition::runTaskDefinition
                ));

        Thread.sleep(100);
    }
}


class CurrentUser{
    final static ScopedValue<String> USERNAME = ScopedValue.newInstance();
}


class TaskDefinition {

    static void runTaskDefinition(){
        Step step = new Step();
        step.performStep();
    }
    
}

class Step{

    public void performStep() {

        System.out.println("name = " + CurrentUser.USERNAME.get());

    }
}
