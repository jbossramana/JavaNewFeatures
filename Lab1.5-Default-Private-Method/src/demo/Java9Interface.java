package demo;

public interface Java9Interface {

	  public abstract void abstractMethod();

	    public  default void defaultMethod() {
	        privateMethod(); //private method inside default method
	        privateStaticMethod(); //static method inside other non-static method
	        System.out.println("default method");
	    }

	    public static void staticMethod() {
	        privateStaticMethod(); //static method inside other static method
	        System.out.println("static method");
	    }

	    private void privateMethod() {
	        System.out.println("private method");
	    }

	    private static void privateStaticMethod() {
	        System.out.println("private static method");
	    }
	    
}
