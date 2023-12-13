package demo.boot.web;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordControllerWithMethodReference {

    private final List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
    );

    @GetMapping("/personMR")
    public List<Person> getPersonsAbove30() {
        // Use a method reference to filter persons above the age of 30
        return filterPeople(this::isPersonAbove30);
    }

    private List<Person> filterPeople(Predicate<Person> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private boolean isPersonAbove30(Person person) {
        return person.age() > 30;
    }
}