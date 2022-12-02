package teamwork_28112022;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String str = scan.nextLine();

        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        int [] counts= new int[255];
        for (int i = 0; i < ch.length; i++) {
                counts[ch[i] - 'a']++;
            }
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > 0) {
                System.out.println((char)(i + 'a') +" " + counts[i] );
            }
        }
        }
    }

