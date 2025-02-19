package demo.code.violation;

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

    public void saveToDatabase() {
        // Method to save employee data to database
        // Code for database interaction
    }

    public double calculateSalary() 
    {
        // Method to calculate salary
        // Code for salary calculation
    	return 10000;
    }

    public void generatePayslip() {
        // Method to generate payslip
        // Code for generating payslip
    }
}
