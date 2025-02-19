package demo.code.srp;

//Employee class responsible for managing employee attributes
public class Employee {
 private String name;
 private int empId;
 private double salary;

 public Employee(String name, int empId, double salary) {
     this.name = name;
     this.empId = empId;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public int getEmpId() {
     return empId;
 }

 public double getSalary() {
     return salary;
 }
}