package teamwork_19_20112022;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI() {
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        setWeight(weight);
        setHeight(height);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<=0){
            throw new IllegalArgumentException("Weight must be above 0");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height must be above 0");
        }
        this.height = height;
    }

    public double bmiCalc(){
        return weight/(height*height);
    }
//    public String bmiResult(){
//        if (bmiCalc() < 18.5) {
//            return "Underweight";
//        }
//        else if (bmiCalc() < 25) {
//            return "Normal";
//        }
//        else if (bmiCalc() < 30) {
//            return "Overweight";
//        }
//        else {
//            return "Obese";
//        }
//    }
    public String bmiResult() {
        return bmiCalc() < 18.5 ? "Underwight" : bmiCalc() < 25 ?
                "Normal" : bmiCalc() < 30 ? "Overwight" : "Obese";
    }
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Your BMI: %5.2f, Result: %s", name, age, bmiCalc(),bmiResult());
    }
}
