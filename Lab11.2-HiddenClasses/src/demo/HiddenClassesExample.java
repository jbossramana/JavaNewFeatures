package demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class HiddenClassesExample {

    public static void main(String[] args) {
        try {
            // Create an instance of the outer class
            Outer outer = new Outer();

            // Access a private method using a hidden class
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
        // Define a hidden method that can access the private method of the outer class
        private static void hiddenMethod(Outer outer) {
            try {
                MethodHandles.Lookup lookup = MethodHandles.lookup();
                MethodType methodType = MethodType.methodType(void.class);
                MethodHandles.Lookup privateLookup = MethodHandles.privateLookupIn(Outer.class, lookup);
                MethodHandle privateMethod = privateLookup.findSpecial(
                        Outer.class, "privateMethod", methodType, Outer.class
                );

                privateMethod.invoke(outer);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

        // Public method to invoke the hidden method
        public void invokePrivateMethod(Outer outer) {
            hiddenMethod(outer);
        }
    }
}
