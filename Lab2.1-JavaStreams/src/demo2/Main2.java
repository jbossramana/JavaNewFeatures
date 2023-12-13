package demo2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 45, "male"),
                new Person("Alice", 60, "female"),
                new Person("Bob", 55, "male"),
                new Person("Charlie", 40, "male"),
                new Person("Diana", 70, "female")
        );

        List<Person> filteredStream = people.stream()
        		   .peek(person -> System.out.println("Before filter: " + person.getName()))
                .filter(person -> person.getAge() > 30 && "male".equals(person.getGender()))
                .peek(person -> System.out.println("After filter: " + person.getName()))
                .collect(Collectors.toList());
            

        filteredStream.forEach(person -> System.out.println("Result: " + person.getName()));
        
        // Additional conditions: Convert names to uppercase
        List<String> filteredNamesUppercase = filteredStream.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());
   
        filteredNamesUppercase.forEach(System.out::println);
      //  filteredNamesUppercase.forEach(name -> System.out.println("After collect: " + name));
        
        // Using reduce to concatenate the filtered names into a single string
        String concatenatedNames = filteredNamesUppercase
                .stream()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("");

        // Printing the concatenated names
        System.out.println("Concatenated Names: " + concatenatedNames);
    }
}
