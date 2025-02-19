package demo.code.lsp;

//Subclass representing a Permanent Employee
public class PermanentEmployee extends Employee {
 private double bonus;

 public PermanentEmployee(String name, double salary, double bonus) {
     super(name, salary);
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return super.calculateSalary() + bonus;
 }

 public double getBonus() {
     return bonus;
 }
}