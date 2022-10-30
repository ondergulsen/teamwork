package teamwork_29102022;

import java.util.Scanner;

public class NewMathProject {
    public static void main(String[] args) {
        String secim = showMainMenu().toUpperCase();
        switch (secim) {
            case "1" -> {
                String mathSecim = showSubMenuNumber().toUpperCase();
                switch (mathSecim) {
                    case "1" -> {
                        System.out.println("Bir sayı giriniz: ");
                        System.out.println("Sonuç= " + primeNumber(new Scanner(System.in).nextInt()));
                    }
                    case "2" -> {
                        System.out.println("Bir sayı giriniz: ");
                        System.out.println("SonuÇ = "+ perfectNumber(new Scanner(System.in).nextDouble()));
                    }case "Q" -> System.out.println("Çıkış yaptınız!");
                    default -> System.out.println("Yanlış seçim!");
                }
            }
            case "2"-> {
                String volSecim = showSubMenuVolume().toUpperCase();
                switch (volSecim){
                    case "1" ->{
                        System.out.println("KÜp için;");
                        System.out.print("Bir kenar: ");
                        int kupKenar = new Scanner(System.in).nextInt();
                        System.out.printf("Küpün Hacmi: %5d\n", kupHacim(kupKenar));

                    }
                    case "2" ->{
                        System.out.println("Silindir için;");
                        System.out.print("r yarıçap: ");
                        int rSilindir = new Scanner(System.in).nextInt();
                        System.out.print("Yükseklik: ");
                        int hSilindir = new Scanner(System.in).nextInt();
                        double hacim= silindirHacim(rSilindir,hSilindir);
                        System.out.printf("Hacim: %5.2f\n", hacim);
                    }
                    case "3" -> {
                        System.out.println("Küre için;");
                        System.out.print("Bir kenar: ");
                        int kureKenar = new Scanner(System.in).nextInt();
                        System.out.printf("Küpün Hacmi: %5.2f\n", kureHacim(kureKenar));

                    }case "Q" -> System.out.println("Çıkış yaptınız!");
                    default -> System.out.println("Yanlış seçim!");
                }
            }
        }
    }
    private static double kureHacim(int kureKenar) {
        return (4 * Math.PI * Math.pow(kureKenar, 3)) / 3;
    }

    private static double silindirHacim(int rSilindir, int hSilindir) {
        return Math.PI * rSilindir *rSilindir * hSilindir;
    }

    private static int kupHacim(int kupKenar) {
        return kupKenar * kupKenar * kupKenar;
    }

    private static String perfectNumber(double perfectNum) {
        double toplam = 0;
        for (int i = 1; i <= perfectNum; i++) {
            if (perfectNum % i == 0) {
                toplam += i;
            }
        }
        if (toplam / 2 == perfectNum) {
            return " Mükemmel bir sayidir.";
        } else {
            return " Mükemmel bir sayi degildir.";
        }
    }

    private static String primeNumber(int primeNum) {
        int sayac = 0;

        for (int i = 2; i < primeNum; i++) {
            if (primeNum % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return "Asal bir sayidir.";
        } else {
            return " Asal bir sayi degildir.";
        }

    }

    public static String showMainMenu() {

        System.out.println("Ana Menü");
        System.out.println("1. Sayı Hesaplama");
        System.out.println("2. Hacim Hesaplama");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();

    }

    public static String showSubMenuNumber() {
        System.out.println("Alt Menü | Sayı işlemleri");
        System.out.println("1. Prime Number");
        System.out.println("2. Perfect Number");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }

    public static String showSubMenuVolume() {
        System.out.println("Alt Menü | Hacim Hesaplama");
        System.out.println("1. Küp");
        System.out.println("2. Silindir");
        System.out.println("3. Küre");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }
}
