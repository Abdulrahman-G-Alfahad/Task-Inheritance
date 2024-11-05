package company;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

// Getters and setters for name, department, and salary

    @Override
    public String toString() {
        return String.format("Employee:\t%-15s Department:\t%-20s Salary:\t%-10.2f", name, department, salary);
    }
}