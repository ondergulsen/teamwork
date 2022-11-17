package teamwork_15112022;

public class TestApp {
    public static void main(String[] args) {

        /* TODO 1 Create a class named 'Member' having the following members:
        Data members
        1 - Name
        2 - Age
        3 - Phone number
        4 - Address
        5 - Salary
        It also has a method named 'printSalary' which prints the salary of the members.
        Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
        have data members 'specialization' and 'department' respectively.
        Now, assign name, age, phone number, address and salary to an employee and a manager by making an object
        of both of these classes and print the same.*/
//        Employee emp1= new Employee("Ahmet", 35, "505123456", "Ankara", 25000.0, "java");
//        System.out.println(emp1.printSalary());
//        Manager man1= new Manager("Hüseyin", 41, "5051234578", "İzmir", 35000.0, "Software");
//        System.out.println(man1.printSalary());

        Full_timeEmp emp1= new Full_timeEmp("Ahmet");
        System.out.println(emp1.getSalary());
        Intern int1= new Intern("Osman");
        System.out.println(int1.getSalary());




        /* TODO 2 Problem Statement: Every employee has a standard salary of 20000TL.
        For a full-time employee, increment the salary by 50%, and increment the salary by 25% for an intern.
        After increasing the salary, display the incremented salary.*/




//        TODO 3 Define a class called Vehicle, which is a generic class. Vehicle has 2 private fields: price and number of wheels
//        We then define the classes Car and Motorcycle,which inherit from the class Vehicle. Car class has 2 more fields:
//        model and isAutomatic. Motorcycle has also 2 more fields: model and type.
//        We then define a Test class that instantiates the Car and Motorcycle class.
//        We also demonstrate all information with print() method and use the Vehicle class as the reference.



    }
}
