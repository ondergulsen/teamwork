package teamwork_10122022;

import java.util.Random;

public class SicaklikGrafik {
    public static void main(String[] args) {

//        Bir yılda 365 gün vardır. Bu günler için -30 ve +40 aralığında rasgele sıcaklık üretilecektr.
//        Hangi sıcaklıktan kaç adet olduğunu gösteren grafiği ekrana çizdiriniz.

        int[] temperatures = new int[71];
        Random rand = new Random();

        for (int i = 0; i < 365; i++) {
            int temp = rand.nextInt(71) - 30;
            temperatures[temp + 30]++;
        }


        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(i - 30 + "°C: ");
            for (int j = 0; j < temperatures[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

