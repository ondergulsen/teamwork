package teamwork_24102022;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//        TODO 1: Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
//         programı yazın. Not: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük
//         ise KDV oranını %8 olarak alınız.
//         Örnek :  100 Tl için çıktı; "KDV tutarı 18 tl _ KDV'li fiyat 118 tl"

//        int price, KDV;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen fiyatı giriniz: ");
//        price = input.nextInt();
//        if((price>0) & (price<1000) ){
//            KDV=(price * 18) / 100;
//            System.out.println("Kdv tutarı: " + KDV);
//            price+=KDV;
//            System.out.println("Kdv'li tutar: " + price);
//        }else{
//            KDV=(price * 8) /100;
//            System.out.println("Kdv tutarı: " + KDV);
//            price+=KDV;
//            System.out.println("Kdv'li tutar: " + price);
//        }






//         TODO 2: Taksimetre Programı: Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran
//          programı yazın.
//          Taksimetre açılış ücreti 10 TL'dir.
//          Taksimetre KM başına 2.20 TL tutmaktadır.
//          Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.

//        int km;
//        double tutar;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen mesafe giriniz: ");
//        km = input.nextInt();
//        tutar = (km * 2.20) +10;
////
////        if(tutar < 20){
////            System.out.println("20 tl ödeyin");
////        }else{
////            System.out.println("Ödenecek tutar: " + tutar);
////        }
//
//        tutar = (tutar < 20) ? 20 : tutar;
//        System.out.printf("Toplam ödenecek ücret: %5.2f", tutar);






//        TODO 3 Bir at çiftliğinde, 10 yaş ve üzeri tüm çocukların ata binmesine izin verilir.
//         10 yaşın altındaki çocuklar ise yalnızca 120 cm'den uzun olmaları durumunda ata binebilirler.
//         Kullanıcıya yaşını soran ve at sürüşüne izin verilip verilmediğini gösteren bir kod yazın.
//         Not: Kodunuzun bir karar vermesi için gerekliyse ancak kullanıcıdan boyunu sormalısınız.

//        int yas;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen yasınızı giriniz: ");
//        yas = input.nextInt();
//
//        if(yas >= 10){
//            System.out.println("Ata binebilirsin.");
//        }else if((yas >0)&(yas < 10)) {
//            System.out.println("Lütfen boyunuzu santimetre olarak girin:");
//            int boy = input.nextInt();
//                if(boy>120){
//                    System.out.println("Ata binebilirsin.");
//                }else{
//                    System.out.println("Büyüyünce gel!!!");
//                }
//        }





//        TODO 4 Not Ortalaması Programı: Kullanıcıdan 2 Vize ve 1 Final Notu alarak, not ortalamasının harf olarak
//         karşılığını gösteren program yazın. Kullanıcı finalden 50 altı puan almışsa dersten kalmıştır ve harf sistemine
//         dahil edilmeyecektir.
//         92 ve üstü ortalama A,
//         82-91 arası B,
//         72-81 arası C,
//         62-71 arası D,
//         61 ve altı E dir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.vize giriniz: ");
        int vize1p = input.nextInt();
        System.out.println("Lütfen 2.vize giriniz: ");
        int vize2p = input.nextInt();
        System.out.println("Lütfen final giriniz: ");
        int finalp = input.nextInt();
        double avg = ((double)vize1p + vize2p + finalp) / 3;
        if(finalp<50){
            System.out.println("Dersten kaldınız.");
        }else{
            System.out.printf("Ders Ortalamanız: %5.2f\n", avg);
            System.out.print("Harf Değeriniz: ");
            if(avg >= 92) {
                System.out.println("A");
            }else if ((avg>=82) & (avg<=91)) {
                System.out.println("B");
            }else if ((avg>=72) & (avg<=81)) {
                System.out.println("B");
            }else if ((avg>=62) & (avg<=71)) {
                System.out.println("B");
            }else if (avg<=61) {
                System.out.println("B");
            }else{
                System.out.println("Hatalı not girdiniz. ");
            }
        }
    }
}

