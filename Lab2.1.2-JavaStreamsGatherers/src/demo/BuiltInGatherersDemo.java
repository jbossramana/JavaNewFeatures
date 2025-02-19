package demo;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

//  In the given example, we are creating a stream of a fixed number of integers.

public class BuiltInGatherersDemo {

	@SuppressWarnings("preview")
	public static void main(String[] args) {
		  System.out.println("Fold example:");
	        Stream.of(1, 2, 3, 4, 5)
	                .gather(Gatherers.fold(() -> 1, (a, b) -> a * b))
	                .forEach(System.out::println);

	        System.out.println("Map concurrent example:");
	        Stream.of(1, 2, 3, 4, 5)
	                .gather(Gatherers.mapConcurrent(4, a -> a *2))
	                .forEach(System.out::println);

	        System.out.println("Scan example:");
	        Stream.of(1, 2, 3, 4, 5)
	                .gather(Gatherers.scan(()->1, (a,b) -> a*b))
	                .forEach(System.out::println);

	        System.out.println("Window fixed example:");
	        Stream.of(1, 2, 3, 4, 5)
	                .gather(Gatherers.windowFixed(2))
	                .forEach(System.out::println);

	        System.out.println("Window sliding example:");
	        Stream.of(1, 2, 3, 4, 5)
	                .gather(Gatherers.windowSliding(2))
	                .forEach(System.out::println);
		
	}

}
