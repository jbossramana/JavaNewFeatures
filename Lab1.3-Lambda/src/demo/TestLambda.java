package demo;

import java.util.function.BiFunction;
import java.util.function.Predicate;

interface Custom
{
	 public int calculate(int a, int b);
}

interface Check
{
	public boolean test(int a);
}

public class TestLambda {

	public static void main(String[] args) {
	
		Custom  add = (a,b) -> a+b;
		
		Custom sub = (a,b) -> a-b;
		
		Check  check = (a) -> a>100;
		
		Predicate<Integer> check2 = (a) -> {if(a>100) return true; else return false;};
		
		BiFunction<Integer,Integer,Integer> biAdd = (a,b) -> a+b;
		BiFunction<Integer,Integer,Integer> biSub = (a,b) -> a-b;
		
		System.out.println("Result "+add.calculate(10,20));
		System.out.println("Result "+sub.calculate(30,20));
		
		System.out.println("Result "+biAdd.apply(10,20));
		System.out.println("Result "+biSub.apply(30,20));
		
	}

}
