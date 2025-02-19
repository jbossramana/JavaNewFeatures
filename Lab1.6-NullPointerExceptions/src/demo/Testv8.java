package demo;

import java.util.Optional;

/* In this version, Optional.ofNullable(text) creates an Optional instance that wraps the text 
 * variable. Then, optionalText.map(String::length) applies the length method to the text 
 * only if it is not null. If text is null, orElse(0) provides a default value of 0 to prevent a
 *  NullPointerException. This way, the code handles the possibility of a null value more 
 *  gracefully.
 */
public class Testv8 {

	public static void main(String[] args) {
        String text = "nature";
        Optional<String> optionalText = Optional.ofNullable(text);

        int length = optionalText.map(String::length).orElse(0);

        System.out.println(optionalText.get());
        System.out.println("Length of the text: " + length);
    }
	
}
