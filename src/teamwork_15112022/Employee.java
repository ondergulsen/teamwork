package teamwork_15112022;

public class Employee {
    private final double salary = 20000.0;

    public double getSalary() {
        return salary;
    }

    public void displaySalary() {
        System.out.println("Employee Salary: Tl " + salary);
    }
}

class FullTimeEmployee extends Employee {

    public double increamentSalary() {
        return getSalary() + (getSalary() * 0.50);
    }
}

class InternEmployee extends Employee {

    public double increamentSalary() {
        return getSalary() + (getSalary() * 0.25);
    }
}

