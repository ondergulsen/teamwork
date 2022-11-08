package teamwork_0506112022;

import java.util.Scanner;

public class NewTasks {
    public static void main(String[] args) {

//        TODO Task 1: You have to design a code such that the user has only three tries to guess the correct pin of his/her account.
//            You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.”
//            When incorrect display “Incorrect, try again.”. When ran out of tries display
//            “Sorry but you have been locked out.”

        final int userPin = 1234;
        Scanner input = new Scanner(System.in);
        int count = 3;

        while (count != 0) {
            System.out.println("Lütfen 4 haneli pin kodunuzu giriniz.");
            int enterPin = input.nextInt();
            if (enterPin == userPin) {
                System.out.println("Merhaba, Hoşgeldiniz!");
                break;
            } else if (count > 1) {
                System.out.printf("Yanlış girdiniz Son %d hakkınız kaldı.", (count - 1));

            } else {
                System.out.println("Özür dileriz, hesabınız kapatıldı!");
            }
            count--;
        }
    }
}
