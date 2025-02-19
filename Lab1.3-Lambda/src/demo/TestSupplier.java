package demo;

import java.util.function.Supplier;


public class TestSupplier {

	
	public static void main(String args[])
	{
		String name="good";
		
		Supplier<String> supplier = () -> name;
		
		System.out.println("Result " + supplier.get());
	}
	
}
