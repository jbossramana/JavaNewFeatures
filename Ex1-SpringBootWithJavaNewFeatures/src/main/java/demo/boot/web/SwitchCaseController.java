package demo.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwitchCaseController {

	 @GetMapping("/greet")
	    public String greet(@RequestParam String language) {
	        String greeting = switch (language) {
	            case "en" -> "Hello, World!";
	            case "fr" -> "Bonjour, le Monde!";
	            case "es" -> "Hola, Mundo!";
	            default -> "Unsupported language.";
	        };

	        return greeting;
	    }

	    @GetMapping("/calculate")
	    public int calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
	        int result = switch (operation) {
	            case "add" -> num1 + num2;
	            case "subtract" -> num1 - num2;
	            case "multiply" -> num1 * num2;
	            case "divide" -> {
	                if (num2 == 0) {
	                    yield 0; // Avoid division by zero
	                }
	                yield num1 / num2;
	            }
	            default -> 0; // Unsupported operation
	        };

	        return result;
	    }
	    
}
