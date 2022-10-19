package teamwork_19102022;

import java.util.Scanner;

public class MethodsReturnParameters {
    //celcius u fahreinheit a dönüştüren Convert isimli bir metot yazınız

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen derece değeri giriniz: ");
//        double x = input.nextDouble();
//        System.out.println("Fahreinet değeriniz: " + Convert(x) );
//
//
//    }
//    public static double Convert(double celsius){
//        final double sabit = 1.8;
//        return (celsius * sabit) + 32;
//
//        //fahr = (celsius * 1.8) + 32

    //kullanıcıdan alınan değerin tek sayı olup olmadığını sorgulayan isEven isimli bir method yazarak çıktı olarak true veya false verin.

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen  sayıyı giriniz: ");
//        int a = input.nextInt();
//       isEven(a);
//
//
//    }
//    public static boolean isEven(int num){
//        if (num%2 ==0) {
//            System.out.println(false);
//            return false;
//        }else {
//            System.out.println(true);
//            return true;
//        }
        // kulanıcıdan alınan değerin çift sayı olupolmadığını kontrol eden ve ekrana "Bu bir çift sayıdır" "Bu bir çift sayı değildir" yazdıran bir isOdd isimli method çalıştırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("ÇİFT SAYI BULMA PROGRAMI");
        System.out.println("----------------------");
        System.out.println("Lütfen sayı giriniz: ");
        int a = input.nextInt();
        isOdd(a);

    }
    public static boolean isOdd(int x){
        if (x%2 == 0){
            System.out.println("Bu bir çift sayıdır.");
            return true;
        }else{
            System.out.println("Bu bir çift sayı değildir.");
            return false;
        }
    }
}
