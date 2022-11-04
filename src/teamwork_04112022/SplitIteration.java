package teamwork_04112022;

import java.util.Scanner;

public class SplitIteration {
    public static void main(String[] args) {
//        String str = "Ahmet : Berber ; 32 , Arif : Manav ; 55 , Selim : Doktor ; 42 ";
        // 1- Yukarıdaki cümleyi hasNext() metotu ile kelimelere ayıralım.




//        Aşağıdaki cümleyi split metotu ile 1-for each 2-while kullanarak kelimelere ayıralım;
//        İsim Meslek Yaş başlıkları halinda tablo şeklinde listeleyelim.
//        Çıktı:
//        İsim	Meslek	Yaş
//        Ahmet	Berber	32
//        Arif	Manav	55
//        Selim	Doktor	42

        String str = "Ahmet:Berber;32,Arif:Manav;55,Selim:Doktor;42";
        String[] myList= str.split("[ ,:;]");
////        for (String i:
////             myList) {
////            System.out.print(i);
////
////        }
        System.out.println("İsim\tMeslek\tYaş");
        for (int i = 0; i < myList.length; i+=3) {
            System.out.print(myList[i] + "\t" + myList[i+1] + "\t" + myList[i+2]);
            System.out.println();


        }

    }
}
