package demo;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class DateTimeStreamExample {

    public static void main(String[] args) {
        // Creating a list of LocalDateTime objects
        List<LocalDateTime> dateTimes = List.of(
                LocalDateTime.of(2023, 1, 15, 10, 30),
                LocalDateTime.of(2023, 2, 20, 14, 45),
                LocalDateTime.of(2023, 3, 5, 8, 0),
                LocalDateTime.of(2023, 4, 10, 18, 15)
        );

        // Filtering date times using Stream API
        List<LocalDateTime> filteredDateTimes = dateTimes.stream()
                .filter(dateTime -> dateTime.getMonthValue() == 2) // Filter by month (February)
                .collect(Collectors.toList());

        // Printing the filtered date times
        System.out.println("Filtered Date Times:");
        filteredDateTimes.forEach(dateTime ->
                System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))));
        
     // Filtering date times within a specific date range
        LocalDateTime startDate = LocalDateTime.of(2023, 2, 1, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2023, 4, 1, 23, 59);

        List<LocalDateTime> dateRangeFiltered = dateTimes.stream()
                .filter(dateTime -> dateTime.isAfter(startDate) && dateTime.isBefore(endDate))
                .collect(Collectors.toList());

        System.out.println("Date Range Filtered Date Times:");
        dateRangeFiltered.forEach(dateTime ->
                System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))));

        
     // Filtering date times within a specific hour range
        int startHour = 12;
        int endHour = 16;

        List<LocalDateTime> hourRangeFiltered = dateTimes.stream()
                .filter(dateTime -> dateTime.getHour() >= startHour && dateTime.getHour() <= endHour)
                .collect(Collectors.toList());

        System.out.println("Hour Range Filtered Date Times:");
        hourRangeFiltered.forEach(dateTime ->
                System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))));

     // Filtering date times based on a specific day of the week (e.g., Monday)
        DayOfWeek targetDayOfWeek = DayOfWeek.MONDAY;

        List<LocalDateTime> dayOfWeekFiltered = dateTimes.stream()
                .filter(dateTime -> dateTime.getDayOfWeek() == targetDayOfWeek)
                .collect(Collectors.toList());

        System.out.println("Day of Week Filtered Date Times:");
        dayOfWeekFiltered.forEach(dateTime ->
                System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))));

        
    }
}
