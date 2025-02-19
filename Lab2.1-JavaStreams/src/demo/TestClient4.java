package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

//  We are creating a stream from generated elements. This will produce a stream of 20 random numbers.
// We have restricted the elements count using limit() function.

public class TestClient4 {

	public static void main(String[] args) {

		Stream<Integer> randomNumbers = Stream
			      .generate(() -> (new Random()).nextInt(100));

			randomNumbers.limit(20).forEach(System.out::println);
		
	}

}
