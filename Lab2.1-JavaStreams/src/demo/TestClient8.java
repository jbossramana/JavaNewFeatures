package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// we create a stream on integers 1 to 10. Then we process the stream elements to find all even numbers.
// we are collecting even numbers in an Array.


public class TestClient8 {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Ramana");
		memberNames.add("Shekhar");
		memberNames.add("Surya");
		memberNames.add("Rahul");
		memberNames.add("Lakshmi");
		memberNames.add("Salman");
		memberNames.add("Mani");
		memberNames.add("Gopal");
		
		memberNames.stream().filter((s) -> s.startsWith("R"))
        .forEach(System.out::println);
		
		System.out.println("##############");
		memberNames.stream().filter((s) -> s.startsWith("R"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		System.out.println("##############");
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		System.out.println("##############");
		//The collect() method is used to receive elements from steam and store them in a collection.
		
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

System.out.print(memNamesInUppercase);

System.out.println("##############");

// The count() is a terminal operation returning the number of elements in the stream as a long value.

long totalMatched = memberNames.stream()
.filter((s) -> s.startsWith("A"))
.count();

System.out.println(totalMatched); 

System.out.println("##############");
// The reduce() method performs a reduction on the elements of the stream with the 
// given function. The result is an Optional holding the reduced value

Optional<String> reduced = Optional.ofNullable(memberNames.stream()
.reduce("names:",(s1,s2) -> s1 + "#" + s2));

reduced.ifPresent(System.out::println);

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using reduce with an initial value
int sum = numbers.stream()
    .reduce( 100,(s1, s2) -> s1 + s2);

// Print the result
System.out.println("Sum: " + sum);



		
	}

}
