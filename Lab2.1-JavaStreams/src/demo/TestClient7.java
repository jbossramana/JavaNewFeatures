package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// we create a stream on integers 1 to 10. Then we process the stream elements to 
// find all even numbers. We are collecting even numbers in an Array.


public class TestClient7 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		 
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);
		
		 // Using Arrays.toString() to print the array
        System.out.println(Arrays.toString(evenNumbersArr));
		
		
	}

}
