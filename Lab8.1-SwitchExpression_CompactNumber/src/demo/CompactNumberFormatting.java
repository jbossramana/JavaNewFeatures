package demo;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
	public static void main(String[] args) {
        long number = 12345678;

        // Example 1: Using default locale and SHORT style
        NumberFormat compactFormat = NumberFormat.getCompactNumberInstance();
        String formattedShort = compactFormat.format(number);
        System.out.println("Short Format: " + formattedShort);

        // Example 2: Using default locale and LONG style
        compactFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH ,NumberFormat.Style.LONG);
        String formattedLong = compactFormat.format(number);
        System.out.println("Long Format: " + formattedLong);

        // Example 3: Using a specific locale and SHORT style
        compactFormat = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);
        String formattedGerman = compactFormat.format(number);
        System.out.println("German Format: " + formattedGerman);

        // Example 4: Using a specific locale and LONG style
        compactFormat = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.LONG);
        String formattedChinese = compactFormat.format(number);
        System.out.println("Chinese Format: " + formattedChinese);


        // Example 5: Using NumberFormat with CompactStyle (Java 12 and later)
        NumberFormat compactNumberFormat = NumberFormat.getCompactNumberInstance();

        // Format various numbers
        System.out.println(compactNumberFormat.format(1000));        // Output: 1T
        System.out.println(compactNumberFormat.format(1500000));     // Output: 1.5L
        System.out.println(compactNumberFormat.format(2000000000));  // Output: 200Cr

        // Customize the format for larger numbers
        compactNumberFormat.setMaximumFractionDigits(2);  // Set maximum fraction digits to 2
        System.out.println(compactNumberFormat.format(1234567890));  // Output: 123.46Cr
       
    }
}

