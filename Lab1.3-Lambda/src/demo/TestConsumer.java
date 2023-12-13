package demo;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String args[])
	{
		
		String name="good";
		
		Consumer<String> consumer = (n) -> System.out.println("Restult " + n);
		
		consumer.accept(name);
	}
}
