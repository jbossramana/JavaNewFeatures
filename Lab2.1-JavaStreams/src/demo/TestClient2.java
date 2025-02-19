package demo;

import java.util.stream.Stream;

// we are creating a stream from the array. The elements in the stream are taken from the array.

public class TestClient2 {

	public static void main(String[] args) {

Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
stream.forEach(p -> System.out.println(p));

	}

}
