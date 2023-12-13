package demo;

import java.util.List;

public class FluentAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> result = FluentListProcessor.fromList(numbers)
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .forEach(System.out::println)
                .getResult();

        System.out.println("Final Result: " + result);
    }
}