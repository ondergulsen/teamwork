package teamwork_15112022;

public class Intern extends Member{
    double increament= 1.25;
    double incSalary=20000;

    public Intern(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        double incSalary=super.getSalary() * increament;
        return incSalary;
    }

}
