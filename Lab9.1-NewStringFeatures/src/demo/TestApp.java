package demo;

import java.util.List;
import java.util.stream.Collectors;

public class TestApp {

	public static void main(String args[])
	{
		
		String str = "  Hello, World  ";
		boolean isBlank = str.isBlank(); // true
		System.out.println("isBlank(): "+ isBlank);

		String stripped = str.strip(); // "Hello, World!"
		
		System.out.println("strip() :"+ stripped);
		String repeated = "abc".repeat(3); // "abcabcabc"

		System.out.println(repeated);
		String multilineString = "Line 1\nLine 2\nLine 3";
		List<String> lines = multilineString.lines().collect(Collectors.toList());


		// Displaying elements using method reference
        lines.forEach(System.out::println);
        
		
	}
}
