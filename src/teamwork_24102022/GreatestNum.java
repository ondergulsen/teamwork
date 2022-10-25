package teamwork_24102022;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı girin: ");
        a = input.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        b = input.nextInt();
        System.out.println("Üçüncü sayıyı girin: ");
        c = input.nextInt();

        if(a>b & a>c) {
            System.out.println(a + " en büyük sayıdır");
        }else if (b>a & b>c) {
            System.out.println(b + " en büyük sayıdır");
        }else{
            System.out.println(c+" en büyük sayıdır");
        }
    }
}
