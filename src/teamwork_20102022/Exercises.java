package teamwork_20102022;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        // Write a Java program to get a number from the user and print whether it is zero, positive or negative
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        int num = input.nextInt();
        if (num > 0 ){
            System.out.println(num + " Pozitiftir. ");
        }else if(num < 0){
            System.out.println(num + " Negatiftir");
        }else{
            System.out.println(num + " Sıfıra eşittir");
        }
    }
}
