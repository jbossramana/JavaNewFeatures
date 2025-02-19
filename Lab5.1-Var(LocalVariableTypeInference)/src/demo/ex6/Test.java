package demo.ex6;

//Java program to explain that
//var cannot be used for a method
//parameters and return type

class MainTest {

	// method1 using var
	// as a return type
	var method1() { return ("Inside Method1"); }

	// method2 using var for a
	// parameter
	void method2(var a) { System.out.println(a); }

	public static void main(String[] args)
	{

		// create an instance
		MainTest obj = new MainTest();

		// call method1
		var res = obj.method1();

		// call method2
		obj.method2();
	}
}

