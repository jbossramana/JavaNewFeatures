package demo.ex1;

import java.util.Arrays;

public class MainTest2 {

	public static void main(String[] args)
	{
		var account = new Account();
		account.setName("Good");
		System.out.println(account.getName());
		
		//var list = new ArrayList<String>();

       var list = Arrays.asList("One", "Two", "Three", "Four", "Five");
	}
}
