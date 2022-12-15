package teamwork_07122022;

import java.util.Random;

public class NotlarGrafik {
    public static void main(String[] args) {
        int[] notlar = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < notlar.length; i++) {
            notlar[i] = rnd.nextInt(101);
        }

        int[] notlarToplam = new int[101];
        for (int not : notlar) {
            notlarToplam[not]++;
        }

        System.out.println("Notlar\tSayısı");
        for (int not = 100; not >= 0; not--) {
            System.out.print(not + "\t\t");
            for (int i = 0; i < notlarToplam[not]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
