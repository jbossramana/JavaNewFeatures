package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//  we create a stream from the characters of a given string. In the second part, 
// we are creating  the stream of tokens received from splitting from a string.

public class TestClient5 {

	public static void main(String[] args) {

		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));

		//OR
         System.out.println("Stream2 result: ");
		Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
		stream2.forEach(p -> System.out.println(p));
		
		
	}

}
