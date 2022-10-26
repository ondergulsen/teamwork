package teamwork_26102022;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SwitchCaseExamples {
    public static void main(String[] args) {

//        TODO 1 Task 1: Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız. Verilen açılara göre;
//         "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren Java programını yazınız.
//         Not: Üçgenin iç açıları toplamı 180'dir.
//        int angel1, angel2, angel3, sum;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("İlk açıyı girin:");
//        angel1 = scanner.nextInt();
//        System.out.print("İkinci açıyı girin:");
//        angel2 = scanner.nextInt();
//        System.out.print("Üçüncü açıyı girin:");
//        angel3 = scanner.nextInt();
//        sum = angel1 + angel2 + angel3;
////        if (sum == 180 & angel1 != 0 & angel2 != 0 & angel3 != 0) {
////            System.out.println("Üçgendir");
////
////        } else {
////            System.out.println("Üçgen değildir");
////        }
//        switch(sum) {
//            case 180:
//                System.out.println("Üçgendir");
//                break;
//            default:
//                System.out.println("Üçgen değildir.");
//        }


//      TODO 2  Task 2:
//        Alan ve Çevre Hesaplama
//        1. Kare
//        2. Daire
//        Seçiminiz:
//        Yukarıdaki menüyü tasarlayınız.
//        Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Kare veya Dairenin Alan Ve Çevresini Hesaplama Programı");
        System.out.println("-".repeat(25));
        System.out.println("1. Kare \n2. Daire");
        System.out.println("-".repeat(25));
        System.out.println("Kare için 1'e,  Daire için 2'ye basınız: ");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Karenin kenar uzunluğunu giriniz:");
                int kenar = input.nextInt();
                int alan = kenar * kenar;
                int cevre = 4 * kenar;
                System.out.println("Alan: " + alan + " \nÇevre: " + cevre);
                break;
            case 2:
                System.out.println("Daire Yarıçap uzunluğunu giriniz:");
                int r = input.nextInt();
                double alanDaire = r * r * Math.PI;
                double cevreDaire = 2 * Math.PI * r;
                System.out.printf("Alan: %5.2f\n", alanDaire);
                System.out.printf("Çevre: %5.2f", cevreDaire);
                break;
            default:
                System.out.println("Yanlış Seçim!");

        }




        // TODO 3: Mevsimleri bulan program yazınız. Kullanıcıdan 1-12 arası değer alıp,  girilen ayın
        //  hangi mevsimde olduğunu yazdırınız.
        //  Örnek: (12 -> KIŞ) (6->YAZ) (3-> İLKBAHAR) (9-> SONBAHAR)
//        1. Ocak
//        2. Şubat
//        3. Mart
//        4. Nisan
//        5. Mayıs
//        6. Haziran
//        7. Temmuz
//        8. Ağustos
//        9. Eylül
//        10. Ekim
//        11. Kasım
//        12. Aralık

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mevsimleri Bulan program");
//        System.out.println("-".repeat(25));
//        System.out.print("Lütfen ay numarası giriniz:");
//        int month = scanner.nextInt();
//        String season= "";
//
//        switch (month){
//            case 12, 1, 2 -> season = "KIŞ";
//            case 3, 4, 5 -> season = "İLKBAHAR";
//            case 6, 7, 8 -> season = "YAZ";
//            case 9, 10, 11 -> season = "SONBAHAR";
//            default -> System.out.println("yanlış değer girdiniz.");
//        }
//        System.out.println("Mevsim: " + season);

    }
}







