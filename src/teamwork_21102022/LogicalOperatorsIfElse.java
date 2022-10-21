package teamwork_21102022;

import java.util.Scanner;

public class LogicalOperatorsIfElse {
    public static void main(String[] args) {
        //TODO 1: Write a program to calculate (and display) the absolute value of a number x: if the number is positive,
        // its absolute value is exactly the number x; if it is negative, its absolute value is -x.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen bir sayı giriniz: ");
//        int num = input.nextInt();
//        int abs;

//        if (num>0){
//          abs = num;
//          System.out.println("Mutlak değeriniz: " + abs);
//        }
//        else if(num<0){
//            abs= -num;
//            System.out.println("Mutlak değeriniz: " + abs);
//
//        }else{
//            System.out.println("Sayınız sıfırdır.");
//        }
//        System.out.println("Girdiğiniz sayı: " + num);

        // Çözüm2:
//        abs = num < 0 ? -num : num; // TODO çok koşullu haline bakalım.
//        System.out.println("|" + num + "|" + "=" + abs);

        // TODO 2: Write a Java program to ask the user for a number; if it is not zero, then it will ask for a
        //  second number and display their product; otherwise, it will display "0".

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bu bir çarpma programıdır.");
//        System.out.println("-----------------");
//        System.out.println("Lütfen ilk sayıyı giriniz: ");
//        int num1 = input.nextInt();
//        if (num1 != 0){
//            System.out.println("İkinci sayıyı giriniz");
//            int num2= input.nextInt();
//            System.out.println("Çarpım sonucunuz: " + (num1 * num2));
//        }else{
//            System.out.println("Sıfır değeri girdiniz. ");
//        }


        //TODO 3: Write a Java program to ask the user for two numbers, and show their division if the second number
        // is not zero; otherwise, it will display "I cannot divide"

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bu bir bölme programıdır.");
//        System.out.println("-----------------");
//        System.out.println("Lütfen ilk sayıyı giriniz: ");
//        int n1 = input.nextInt();
//        System.out.println("Lütfen ikinci sayıyı giriniz: ");
//        int n2 = input.nextInt();
//
//        if (n2 != 0){
//            double bolum = (double) n1 /n2;
//            System.out.println("Sayıların birbirine bölüm değeri: " + bolum);
//        }else{
//            System.out.println("Sıfıra bölemem.");
//        }



        //TODO 4: Create a program to accept two numbers from the user and answer if both are NEGATİVE( a ve b sayıları negatif),
        // if only one is NEGATİVE(a veya b sayısı negatif), or if none of them(hiçbiri negatif değil) is NEGATİVE.

        Scanner input = new Scanner(System.in);
        System.out.println("Bu bir negatif/pozitif sayı programıdır.");
        System.out.println("-----------------");
        System.out.println("Lütfen ilk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int n2 = input.nextInt();
//        Cözüm 1:
//        if ((n1 < 0) & (n2 < 0)){
//            System.out.println("İki sayı da negatiftir");
//        }else if((n1 < 0) | (n2<0)){
//            System.out.println("Sayılardan yalnız biri negatifir.");
//        }else{
//            System.out.println("Sayıların ikisi de negatif değildir.");}
//       Cözüm 2:
        if ((n1 & n2) < 0){
            System.out.println("İkisi de negatif.");

        }else if ((n1 | n2) < 0){
            System.out.println("Sayılardan biri negatif.");
        }else{
            System.out.println("İkisi de negatif değil");
        }


    }
}
