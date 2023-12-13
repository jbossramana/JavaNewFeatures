package demo.ex1;

//Java program to explain that
//var can used to declare any datatype

class MainTest {

	public static void main(String[] args)
	{

		// int
		var x = 100;

		// double
		var y = 1.90;

		// char
		var z = 'a';

		// string
		var p = "surya";

		// boolean
		var q = false;

		// type inference is used in var keyword in which it
		// automatically detects the datatype of a variable
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		System.out.println(q);
	}
}
