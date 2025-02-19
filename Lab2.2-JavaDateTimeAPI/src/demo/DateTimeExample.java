package demo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public static void main(String[] args) {
        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        
     // Time zone: India
        ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiaDateTime = ZonedDateTime.of(dateTime, indiaZoneId);
        System.out.println("India: " + indiaDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        // ZonedDateTime
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("Current Date and Time in New York: " + zonedDateTime);

        // Instant
        Instant instant = Instant.now();
        System.out.println("Current Timestamp: " + instant);

        // Duration
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2).plusMinutes(30);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration between two times: " + duration);

        // Period
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        System.out.println("Period between two dates: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");

        // DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
