package demo;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface MaxFinder {
    int findMax(int a, int b);
}

public class LambdaTernaryExamples {
    public static void main(String[] args) {

        // Example 1: Lambda to check Even or Odd using ternary operator
        Function<Integer, String> checkEvenOdd = n -> (n % 2 == 0) ? "Even" : "Odd";
        System.out.println("Example 1: " + checkEvenOdd.apply(10)); // Output: Even
        System.out.println("Example 1: " + checkEvenOdd.apply(15)); // Output: Odd

        // Example 2: Lambda using Predicate to check if a number is positive
        Predicate<Integer> isPositive = num -> (num > 0) ? true : false;
        System.out.println("Example 2: " + isPositive.test(5));  // Output: true
        System.out.println("Example 2: " + isPositive.test(-3)); // Output: false

        // Example 3: Lambda to classify grades using multiple conditions in ternary operator
        Function<Integer, String> gradeClassifier = marks -> 
            (marks >= 90) ? "A+" :
            (marks >= 75) ? "A" :
            (marks >= 60) ? "B" :
            (marks >= 40) ? "C" : "Fail";
        
        System.out.println("Example 3: " + gradeClassifier.apply(85)); // Output: A
        System.out.println("Example 3: " + gradeClassifier.apply(30)); // Output: Fail

        // Example 4: Lambda to find the maximum of two numbers
        MaxFinder maxFinder = (a, b) -> (a > b) ? a : b;
        System.out.println("Example 4: Max number: " + maxFinder.findMax(10, 20)); // Output: 20

        // Example 5: Lambda with ternary operator in Stream API
        List<Integer> numbers = List.of(3, 7, 2, 8, 5);
        System.out.println("Example 5: Processing numbers with Stream API:");
        numbers.stream()
               .map(n -> (n % 2 == 0) ? "Even: " + n : "Odd: " + n)
               .forEach(System.out::println);
    }
}
