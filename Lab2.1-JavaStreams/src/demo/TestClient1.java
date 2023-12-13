package demo;

import java.util.stream.Stream;

//  In the given example, we are creating a stream of a fixed number of integers.

public class TestClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(p -> System.out.println(p));
		
	}

}
