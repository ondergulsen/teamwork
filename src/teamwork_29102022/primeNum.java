package teamwork_29102022;

public class primeNum {
    public static void main(String[] args) {
        int primeNum=8;
        int sayac = 0;

        for (int i = 2; i < primeNum; i++) {
            if (primeNum % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(primeNum + " Asal bir sayidir.");
        } else {
            System.out.println(primeNum + " Asal bir sayi degildir.");
        }
    }
}
