package demo.boot.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecordController {

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Surya", 30);
    }
}

record Person(String name, int age) {}


