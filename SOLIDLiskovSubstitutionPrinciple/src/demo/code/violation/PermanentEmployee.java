package demo.code.violation;

//Subclass representing a Permanent Employee
public class PermanentEmployee extends Employee {
 public PermanentEmployee(String name, double salary, double bonus) {
     super(name, salary, bonus);
 }

 @Override
 public double calculateSalary() {
     return salary + bonus;
 }

 @Override
 public double calculateBonus() {
     return bonus;
 }
}
