package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//  we are creating a stream from the List. The elements in the stream are taken from the List.

public class TestClient3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
		
	}

}
