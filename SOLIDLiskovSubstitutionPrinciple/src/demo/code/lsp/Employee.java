package demo.code.lsp;

//Base class representing Employee
public class Employee {
 protected String name;
 protected double salary;

 public Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 public double calculateSalary() {
     return salary;
 }
}