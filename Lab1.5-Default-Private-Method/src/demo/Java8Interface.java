package demo;

public interface Java8Interface {

    public abstract void method1();
    
    public default void method2() {
        System.out.println("default method");
    }
     
    public static void method3() {
        System.out.println("static method");
    }
}
