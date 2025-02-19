package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//we create a stream on integers 1 to 10. Then we process the stream elements 
// to find all even numbers. At last, we are collecting all even numbers into a List.

public class TestClient6 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		 
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
		                                    .collect(Collectors.toList());
		System.out.print(evenNumbersList);
		
		
	}

}
