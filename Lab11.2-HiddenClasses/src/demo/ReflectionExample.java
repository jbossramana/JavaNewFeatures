package demo;

import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            // Create an instance of the outer class
            Outer outer = new Outer();

            // Access a private method using reflection
            HiddenClass hiddenClass = new HiddenClass();
            hiddenClass.invokePrivateMethod(outer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Outer {
        private void privateMethod() {
            System.out.println("This is a private method in the outer class.");
        }
    }

    static class HiddenClass {
        // Using reflection to access the private method of the outer class
        public void invokePrivateMethod(Outer outer) {
            try {
                // Get the private method from the Outer class
                Method privateMethod = Outer.class.getDeclaredMethod("privateMethod");
                // Allow access to the private method
                privateMethod.setAccessible(true);
                // Invoke the private method on the given instance
                privateMethod.invoke(outer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
