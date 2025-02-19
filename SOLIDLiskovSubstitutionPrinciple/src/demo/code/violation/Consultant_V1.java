package demo.code.violation;

//Subclass representing a Consultant
public class Consultant_V1 extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public Consultant_V1(String name, double hourlyRate, int hoursWorked) {
     super(name, 0, 0); // Consultants don't have a fixed salary or bonus
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }


}
