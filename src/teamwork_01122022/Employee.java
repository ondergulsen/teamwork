package teamwork_01122022;

public class Employee implements Comparable <Employee>, Cloneable {
    private String name;
    private int age;
    private Integer salary;

    public Employee() {
    }


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public Employee clone() {
        Employee emp= new Employee(name,age,salary);
        return emp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee employee) {
//        return this.name.compareTo(employee.name); İsme göre sıralama
        return this.salary.compareTo(employee.salary);
    }
}

