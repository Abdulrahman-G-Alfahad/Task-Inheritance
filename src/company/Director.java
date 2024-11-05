package company;

public class Director extends Employee{
    private double budget;

    public Director(String name, String department, double salary, double budget) {
        super(name, department, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s Position: Director\t Budget: %s", "", budget);
    }

}
