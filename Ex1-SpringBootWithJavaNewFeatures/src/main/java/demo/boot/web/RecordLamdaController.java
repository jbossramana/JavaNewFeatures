package demo.boot.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RecordLamdaController {

    private final List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
    );

    @GetMapping("/personLamda")
    public List<Person> getPersonsAbove30() {
        // Use a lambda expression to filter persons above the age of 30
        return filterPeople(person -> person.age() > 30);
    }

    private List<Person> filterPeople(java.util.function.Predicate<Person> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}



