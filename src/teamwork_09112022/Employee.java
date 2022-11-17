package teamwork_09112022;

public class Employee {
    String name;
    int salary;
    int workHour;

    public Employee(String name, int salary, int workHour) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
    }

    void getInfo() {
        System.out.printf(" %s salary: %d workhour: [%d] ", name, salary, workHour);
    }

    void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    void addWork() {
        if (workHour > 6) {
            salary += 5;
        }
    }
}
