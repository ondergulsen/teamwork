package teamwork_07122022;

public class Student {
    private int age;
    private String name;
    private int no;

    public Student(int age, String name, int no) throws Exception {
        if (age < 0) {
            throw new Exception("Age can not be negative!");
        } else if (name.isBlank()) {
            throw new Exception("Name can not be empty!");
        } else {
            this.age = age;
            this.name = name;
            this.no = no;
        }

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }
}
