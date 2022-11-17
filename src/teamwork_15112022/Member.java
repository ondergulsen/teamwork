package teamwork_15112022;

public class Member {
    private String name;
    private int age;
    private String phoneNum;
    private String address;
    private final double salary=20000.0;

    public Member(String name) {
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }



    public Member(String name, int age, String phoneNum, String address) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.address = address;
    }



}
