package teamwork_28112022;

import java.util.Scanner;

public class StringTask {



    public static void main(String[] args) {

//        Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
//                * return eden metod yaziniz
//     *
//     * ornek:  input            output
//     *         elma  2           eaea
//     *         army  3           ayayay


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String word = scan.nextLine();
        System.out.println("Tekrar sayısı giriniz: ");
        int rep = scan.nextInt();

        String b = (String.valueOf(word.charAt(0)) + String.valueOf(word.charAt(word.length() - 1))).repeat(rep);
        System.out.println(b);

    }
}
