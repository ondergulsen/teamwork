package teamwork_29102022;

import java.util.Scanner;

public class MenuDrivenMathProject {
    public static void main(String[] args) {
        String secim = showMainMenu().toUpperCase();
        switch (secim) {
            case "1" -> {
                String mathSecim = showSubMenuMath().toUpperCase();
                switch (mathSecim) {
                    case "1" -> {
                        System.out.print("Faktöriyel için sayı: ");
                        System.out.println("Sonuç= " + factorial(new Scanner(System.in).nextInt()));
                    }
                    case "2" -> {
                        System.out.print("Mutlak değer için sayı: ");
                        System.out.println("Sonuç: " + mutlak(new Scanner(System.in).nextInt()));
                    }
                    case "Q" -> System.exit(0);
                    default -> System.out.println("Yanlış seçim yaptınız.");
                }
            }
            case "2" -> {
                String geoSecim = showSubMenuGeoCounting().toUpperCase();
                switch (geoSecim) {
                    case "1" -> {
                        System.out.println("Dikdörtgen için;");
                        System.out.print("Uzun kenar: ");
                        int uKenar = new Scanner(System.in).nextInt();
                        System.out.print("Kısa kenar: ");
                        int kKenar = new Scanner(System.in).nextInt();
                        double cevre = cevreHesapla(uKenar, kKenar);
                        System.out.printf("Çevre: %5.2f\n", cevre);
                        double alan = alanHesapla(uKenar, kKenar);
                        System.out.printf("Alan: %5.2f\n", alan);
                    }
                    case "2" -> {
                        System.out.println("Kare için;");
                        System.out.print("Bir kenar: ");
                        int kareKenar = new Scanner(System.in).nextInt();
                        System.out.printf("Çevre: %5.2f\n", cevreHesapla(kareKenar, kareKenar));
                        System.out.printf("Alan: %5.2f\n", alanHesapla(kareKenar, kareKenar));
                    }
                    case "3" -> {
                        System.out.println("Daire için;");
                        System.out.print("Yarıçap: ");
                        double r = new Scanner(System.in).nextDouble();
                        System.out.printf("Çevre: %5.2f\n", cevreDaire(r));
                        System.out.printf("Alan: %5.2f\n", alanDaire(r));
                    }
                    case "Q" -> System.exit(0);
                    default -> System.out.println("Yanlış seçim yaptınız.");
                }
            }
            case "Q" -> System.exit(0);
            default -> System.out.println("Yanlış seçim yaptınız.");

        }

    }
    private static double alanDaire(double r) {
        return Math.PI*r*r;
    }

    private static double cevreDaire(double r) {
        return 2*Math.PI*r;
    }

    private static double alanHesapla(int uKenar, int kKenar) {
        return uKenar * kKenar;
    }

    private static double cevreHesapla(int uKenar, int kKenar) {
        return 2*(uKenar + kKenar);
    }

    public static String showMainMenu() {

            System.out.println("Ana Menü");
            System.out.println("1. Matematik İşlemleri");
            System.out.println("2. Alan ve Çevre Hesaplama");
            System.out.println("Q. Çıkış");
            System.out.println("Seçiminiz: ");
            return new Scanner(System.in).nextLine();

    }

    public static String showSubMenuMath() {
        System.out.println("Alt Menü | Matematik işlemleri");
        System.out.println("1. Faktöriyel Hesaplama");
        System.out.println("2. Mutlak Değer Alma");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }

    public static String showSubMenuGeoCounting() {
        System.out.println("Alt Menü | Alan ve Çevre Hesaplama");
        System.out.println("1. Dikdörtgen");
        System.out.println("2. Kare");
        System.out.println("3. Daire");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }

    public static int factorial(int value) {
        if (value <= 2) return 1;
        int carpim = 1;
        for (int i = 2; i <= value; i++) {
            carpim *= i;
        }
        return carpim;
    }

    public static int mutlak(int sayi1) {
        return Math.abs(sayi1);
    }
}

