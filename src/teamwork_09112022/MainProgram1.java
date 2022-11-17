package teamwork_09112022;

public class MainProgram1 {
    public static void main(String[] args) {
//        TASK !!! Write a program by creating an 'Employee' class having the following methods and print the
//        final salary. Use constructors with parameters.
//        1 - 'getInfo()' which shows the salary, number of hours of work per day of employee.
//        2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//        3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

        Employee worker1= new Employee("John", 600, 7);
        Employee worker2= new Employee("George", 400, 4);



        worker1.getInfo();
        worker1.addSal();
        worker1.addWork();
        worker1.getInfo();

        worker2.getInfo();
        worker2.addSal();
        worker2.addWork();
        worker2.getInfo();

    }
}
