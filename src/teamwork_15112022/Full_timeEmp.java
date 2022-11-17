package teamwork_15112022;

public class Full_timeEmp extends Member{
    double increament= 1.50;
    double incSalary=0;

    public Full_timeEmp(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        double incSalary=super.getSalary() * increament;
        return incSalary;
    }



}
