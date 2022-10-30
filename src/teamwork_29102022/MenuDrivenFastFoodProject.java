package teamwork_29102022;
import java.util.Scanner;
public class MenuDrivenFastFoodProject {
    public static void main(String[] args) {
        double hamburger=45.90;
        double patKız=11.99;
        double kola=9.90;
        double gazoz=8.90;

        String choise=showMenu();
        switch (choise){
            case "1":
                System.out.println("hamburger adedi : ");
                int hamAdet=new Scanner(System.in).nextInt();
                double hamUcret=hamAdet*hamburger;
                System.out.println("ödenecek tutar: "+hamUcret);
                System.out.println("gireceğiniz tutar: ");
                double girilenTutar=new Scanner(System.in).nextDouble();
                System.out.printf("para üstünü alınız: %5.2f ",(girilenTutar-hamUcret));break;

            case "2":
                System.out.println("patates kızartması adedi: ");
                int patKızAdet=new Scanner(System.in).nextInt();
                double patUcret=patKızAdet*patKız;
                System.out.println("ödenecek tutar: "+patUcret);
                System.out.println("gireceğiniz tutar: ");
                double girilenTutar1=new Scanner(System.in).nextDouble();
                System.out.printf("para üstünü alınız: %5.2f ",(girilenTutar1-patUcret));break;

            case "3":
                String choise2=showDrinks().toUpperCase();
                switch (choise2) {
                    case "1" -> {
                        System.out.println("kola adedi giriniz: ");
                        int colaAdet = new Scanner(System.in).nextInt();
                        double colaUcret = colaAdet * kola;
                        System.out.println("ödenecek tutar: " + colaUcret);
                        System.out.println("gireceğiniz tutar: ");
                        while (true) {
                            double girilenTutar2 = new Scanner(System.in).nextDouble();
                            if (girilenTutar2 >= colaUcret) {
                                System.out.printf("para üstünü alınız: %5.2f ", (girilenTutar2 - colaUcret));
                                break;
                            } else {
                                System.out.println("yetersiz bakiye..tekrar bakiye giriniz: ");
                            }
                        }
                    }
                    case "2" -> {
                        System.out.println("gazoz adedi giriniz: ");
                        int gazozAdet = new Scanner(System.in).nextInt();
                        double gazozUcret = gazozAdet * gazoz;
                        System.out.println("ödenecek tutar: " + gazozUcret);
                        System.out.println("gireceğiniz tutar: ");
                        double girilenTutar3 = new Scanner(System.in).nextDouble();
                        System.out.printf("para üstünü alınız: %5.2f ", (girilenTutar3 - gazozUcret));
                    }
                    case "E" -> {
                        System.out.println("sistemden çıktınız...");
                        System.exit(0);
                    }
                    default -> System.out.println("yanlış seçim yaptınız.");
                }
            case "E":
                System.out.println("sistemden çıktınız.");
                System.exit(0);break;
            default:
                System.out.println("yanlış seçim yaptınız.");
        }
        /*
2-Hoşgeldiniz !
MENU:
-----------
1. Hamburger (45.50Tl)
2. Patates Kızartması (11.99Tl)
3. İçeçek
4. Çıkış
__
İÇECEK:
1. Kola (9.90tl)
2- Gazoz (8.90 tl)
3- Çıkış
Kullanıcıdan ürün çeşitlerini ve ürün adedini alarak, kullanıcıya satın aldığı ürünleri ve
ne kadar ödeme yapacağını söyleyen, ayrıca kullanıcıdan alınan paranın  üstünü gösteren
bir menü programı yazınız. Not: methods ve switch kullanılacak. */


    }
    public static String showMenu(){
        System.out.println("Hoşgeldiniz !");
        System.out.println("     ---MENU---");
        System.out.println("    ----------");
        System.out.println(" 1. Hamburger  (45.50)");
        System.out.println(" 2.Patates kızartması (11.90)");
        System.out.println(" 3. İçecekler");
        System.out.println(" E.EXİT");
        return new Scanner(System.in).nextLine();

    }
    public static String showDrinks(){
        System.out.println(" 1. Kola   (9.90)");
        System.out.println(" 2. Gazoz  (8.90");
        System.out.println(" E.EXİT");
        return new Scanner(System.in).nextLine();

    }
}


