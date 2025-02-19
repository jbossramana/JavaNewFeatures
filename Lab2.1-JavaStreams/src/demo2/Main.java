package demo2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 45, "male"),
                new Person("Alice", 60, "female"),
                new Person("Bob", 55, "male"),
                new Person("Charlie", 40, "male"),
                new Person("Diana", 70, "female")
        );

        // Creating a stream and filtering elements
        Stream<Person> filteredStream = people.stream()
                .filter(person -> person.getAge() > 40 && "male".equals(person.getGender()))
                .peek(person -> System.out.println("After filter: " + person.getName()));

      //  filteredStream.forEach(person -> System.out.println("Result: " + person.getName()));
        
        // Additional conditions: Convert names to uppercase
        List<String> filteredNamesUppercase = filteredStream
                .map(person -> person.getName().toUpperCase())
                .peek(name -> System.out.println("After map: " + name))
                .collect(Collectors.toList());
        
        //filteredStream.forEach(System.out::println);
        
     // Now, if you want to further process the List, convert it back to a stream
        List<String> furtherProcessedNames = filteredNamesUppercase.stream()
                .map(name -> "Mr " + name )
                .peek(name -> System.out.println("After map Additional processing: " + name))
                .collect(Collectors.toList());
        
        furtherProcessedNames.forEach(System.out::println);

        
        // Using reduce to concatenate the filtered names into a single string
        String concatenatedNames = furtherProcessedNames
                .stream()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("");

        // Printing the concatenated names
        System.out.println("Concatenated Names: " + concatenatedNames);
    }
}