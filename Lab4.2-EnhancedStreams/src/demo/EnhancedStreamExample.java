package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnhancedStreamExample {

    public static void main(String[] args) {
        // Example 1: takeWhile and dropWhile
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> taken = numbers.stream().takeWhile(n -> n < 4).collect(Collectors.toList());
        System.out.println("Take While: " + taken);
        // Output: Take While: [1, 2, 3]

        List<Integer> dropped = numbers.stream().dropWhile(n -> n < 4).collect(Collectors.toList());
        System.out.println("Drop While: " + dropped);
        // Output: Drop While: [4, 5, 6]

        // Example 2: ofNullable for Streams
        String name = "Surya";
        Stream.ofNullable(name).forEach(System.out::println);
        // Output: Surya

        name = null;
        Stream.ofNullable(name).forEach(System.out::println);
        // Does nothing (avoids NullPointerException)

        // Example 3: iterate with a Predicate
        Stream.iterate(1, n -> n < 10, n -> n * 2).forEach(System.out::println);
        // Output: 1, 2, 4, 8
    }
}
