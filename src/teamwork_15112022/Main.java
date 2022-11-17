package teamwork_15112022;

public class Main {
    public static void main(String[] args) {
        // object created
        FullTimeEmployee emp1 = new FullTimeEmployee();
        InternEmployee emp2 = new InternEmployee();

        System.out.println("Salary of an employee before incrementing: ");
        emp1.displaySalary();
        emp2.displaySalary();

        System.out.println("Salary of a full-time employee after incrementing: ");
        System.out.println(emp1.increamentSalary());

        System.out.println("Salary of an intern after incrementing: ");
        System.out.println(emp2.increamentSalary());

    }
}
