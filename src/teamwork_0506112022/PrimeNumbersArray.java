package teamwork_0506112022;

import java.util.Scanner;

public class PrimeNumbersArray {
    public static void main(String[] args) {
//        Task-1 Kullanicidan 10 tane sayi aliniz.
//
//        1. Bu sayilardan kac tanesi asal sayidir, ekrana yazdiriniz.
//        2. Bu sayilardan asal olanlari ekrana yazdiriniz.
//        3. Bu sayilar arasinda asal sayi varsa, asal sayilarin en büyügünü
//        ve en kücügünü bulup ekrana yazdirin. (düzenlendi)

        int[] newList = new int[10];
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz. Lütfen 10 tane sayı giriniz: ");
        for (int i = 0; i < newList.length; i++) {
            System.out.print((i + 1) + ". sayı: ");
            newList[i] = input.nextInt();
        }
        int max = newList[0];
        int min = newList[0];
        System.out.println("Asal Sayılar: ");
        for (int number : newList) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                counter++;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        }
        System.out.printf("\nToplam %s tanesi asaldır.", counter);
        System.out.println("\nMaksimum sayı : " + max);
        System.out.println("Minumum sayı : " + min);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
