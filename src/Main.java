import java.text.DateFormatSymbols;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Task 3: On elemanlı sayilar dizi oluşturunuz. Sonra 0-100 arasındaki rastgele tamsayılarla doldurunuz.
//        Listeleyip, toplamını ve ortalamasını gösteren bir Java programı yazınız.

        Random sayi = new Random();
        int[] myList = new int[10];
        int toplam = 0;
        for (int i = 0; i < myList.length; i++) {
            myList[i] = sayi.nextInt(00, 100);
            System.out.println(myList[i]);
            toplam += myList[i];


        }
        System.out.println("Toplamları: " + toplam);
        System.out.println("Ortalaması: " + ((double)toplam / myList.length));
    }
}





