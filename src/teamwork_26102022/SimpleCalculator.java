package teamwork_26102022;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        double num1;
        int num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk numarayı girin:");
        num1 = scanner.nextDouble();
        System.out.print("İkinci numarayı girin:");
        num2 = scanner.nextInt();
        switch(num2){
            case 0:
            System.out.println("Lütfen 0 girmeyin. hatalı giriş!");
            System.exit(0);
        }
        System.out.print("Yapmak istediğiniz işlem için bir operatör seçin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            default:
                System.out.println("Yanlış işlem türü girdiniz!");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+"= "+output);
    }
}
