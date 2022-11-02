package teamwork_02112022;

public class ForEachLoops {
    public static void main(String[] args) {


        // String[] wordsArray = { "Java", "is", "very", "great!" } For each metodu ile java cümlesini yazdırınız.

//        String[] cumle = { "Java", "is", "very", "great!" };
//
//        for (String kelime:
//             cumle) {
//            System.out.print(kelime + " ");
//
//        }


        // int[] myList= {2, 4, 6, 8, 10} For each metodu ile her bir elemanın karesini ekranı yazıdırınız.

        int[] myList= {2, 4, 6, 8, 10};

        for (int num:
             myList) {
            System.out.println(num + " sayısının karesi= " + Math.pow(num, 2));

        }

//        2 sayısının karesi: 4.0
//        4 sayısının karesi: 16.0


        }

}


