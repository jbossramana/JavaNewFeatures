package demo;

/*In this example, the day variable is switched using a switch expression. 
Depending on the value of day,the switch expression directly assigns the 
corresponding day name to the dayName variable. This allows you to use the 
switch statement as an expression and assign its value directly to a variable, 
as per the enhancement introduced in Java 14.*/

public class SwitchExpressionExample14 {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };

        System.out.println("Today is " + dayName);
    }
}
