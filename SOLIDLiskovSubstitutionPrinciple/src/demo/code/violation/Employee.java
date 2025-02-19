package demo.code.violation;

//Base class representing Employee
public class Employee {
 protected String name;
 protected double salary;
 protected double bonus;

 public Employee(String name, double salary, double bonus) {
     this.name = name;
     this.salary = salary;
     this.bonus = bonus;
 }

 public double calculateSalary() {
     return salary + bonus;
 }

 public double calculateBonus() {
     return bonus;
 }
}