package demo;

/*In this example, the day variable is switched using a switch expression. 
Depending on the value of day,the switch expression directly assigns the 
corresponding day name to the dayName variable. This allows you to use the 
switch statement as an expression and assign its value directly to a variable, 
as per the enhancement introduced in Java 14.*/

public class SwitchExpressionExample8 {
    public static void main(String[] args) {
    	int day = 3;
    	String dayName;

    	if (day == 1) {
    	    dayName = "Monday";
    	} else if (day == 2) {
    	    dayName = "Tuesday";
    	} else if (day == 3) {
    	    dayName = "Wednesday";
    	} else if (day == 4) {
    	    dayName = "Thursday";
    	} else if (day == 5) {
    	    dayName = "Friday";
    	} else {
    	    dayName = "Weekend";
    	}

        System.out.println("Today is " + dayName);
    }
}
