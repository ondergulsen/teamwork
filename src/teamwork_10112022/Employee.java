package teamwork_10112022;

public class Employee {
    public String name;
    public int salary;
    public int workHours;
    public int hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int bonus(){
        if(this.workHours > 40){
            int bonus=30 * (this.workHours-40);
            return bonus ;
        } else{
            return 0;
        }
    }

    public double raiseSalary(){
        int hireTime=2022-this.hireYear;
        if(hireTime < 10){
            return this.salary * 0.05;

        } else if (hireTime>10 & hireTime<20) {
            return this.salary * 0.10;

        }else {
            return this.salary * 0.15;
        }
    }
    public String toString(){
        return "Çalışanın adı: " + this.name + " Çalışanın maaşı: " + this.salary + " Çalışma saati: "
                + this.workHours + " İşe giriş yılı: " + this.hireYear ;
    }
}
