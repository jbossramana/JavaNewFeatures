package demo;

public class Java8MainClass  implements Java8Interface{

	public static void main(String[] args) {
	
		Java8Interface  action = new Java8MainClass();
		action.method1();
		action.method2();
		Java8Interface.method3();

	}

	@Override
	public void method1() {

      System.out.println("Inside Abstract method1()");
		
	}
	
	 public  void method2() {
	        System.out.println("default method.. from main");
	    }

}
