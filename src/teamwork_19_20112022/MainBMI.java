package teamwork_19_20112022;

import java.util.Scanner;

public class MainBMI {
    /*
          1 ) BMI ve MainBMI class'ları creat ediniz
          2 ) BMI class'ı için field'ları name(String), age(int), weight(double) ve height(double) olan veriable'lar
          oluşturup tüm veriableleri encapsule ediniz.
          3 ) tüm  field'ları setter getter ve  constructor creat ediniz.
          4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
          5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren
          method creat ediniz.
          6 ) MainBMI de  bu değereli yazdırınız.
            */
    public static void main(String[] args) {
        BMI test1 = new BMI("Ali", 35, 100,1.90);
        BMI test2 = new BMI("Osman", 62, 68.5,1.70);

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome BMI Calculator Programme");
        System.out.println("-".repeat(20));
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your age: ");
        int age= s.nextInt();
        System.out.print("Please enter your weight in kg: ");
        double weight = s.nextDouble();
        System.out.print("Please enter your height in m: ");
        double height = s.nextDouble();

        BMI test3= new BMI(name, age, weight,height);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }

}
