package demo.code.lsp;

//Subclass representing a Consultant
public class Consultant extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public Consultant(String name, double hourlyRate, int hoursWorked) {
     super(name, 0); // Consultants don't have a fixed salary
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}
