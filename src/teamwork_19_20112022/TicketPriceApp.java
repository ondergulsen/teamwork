package teamwork_19_20112022;
import java.util.Scanner;

public class TicketPriceApp {
    public static void main(String[] args) {
//        A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
//        Bilet tarifesi:
//        km birim fiyati : 0.10$
//        yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
//                12 ve 24 yas arasindaysa 10% indirim,
//                65 yasindan buyukse 30% indirim,
//                bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

        Scanner inp = new Scanner(System.in);

        final double pricePerKm = 0.10;
        int km=0;
        boolean flag = false;
        double price;
        while (!flag) {
            System.out.print("Please select city you want to fly: ");
            char city = inp.next().toUpperCase().charAt(0);
            switch (city) {
                case 'B' -> {
                    km = 500;
                    flag = true;
                }
                case 'C' -> {
                    km = 700;
                    flag = true;
                }
                case 'D' -> {
                    km = 900;
                    flag = true;
                }
                default -> System.out.println("Your choice is wrong: ");
            }
        }

        System.out.println("Please select your trip type: \n1->One-Way \n2->Round ");
        int tripType = inp.nextInt();

        System.out.print("Please enter your age: ");
        int age = inp.nextInt();

        price = km * pricePerKm;
        if (age < 12) {
            price *= 0.50;
        } else if (age > 12 & age < 24) {
            price *= 0.90;
        } else if (age >= 65) {
            price *= 0.70;
        } else if (tripType == 2) {
            price *= 0.80;
        }

        System.out.println("Your price is: $" + price);
    }
}
