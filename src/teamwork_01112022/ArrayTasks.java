package teamwork_01112022;



public class ArrayTasks {
    public static void main(String[] args) {

        //Write some Java code that stores five foods you like to eat for dinner in an array.



        String[] meals= {"pilav", "lahmacun", "köfte", "salata", "makarna"};


        // Listenin birinci ve üçüncü elamanını ekranda gösteriniz.

//        System.out.println(meals[0] + " "+  meals[2]);
//
//
//        // Listenin son elemanını ekranda gösteriniz.
//        System.out.println(meals[meals.length-1]);


        //Listenin elemanlarını for döngüsü ile alt alta yazdırınız.

//        for (int i = 0; i < meals.length; i++) {
//            System.out.println(meals[i]);
//
//        }
//        for (String i:
//             meals) {
//            System.out.println(i);
//        }


        //listede 4. sıradaki elemanın yerine "Kebap" ekleyiniz ve yazdırınız.

        meals[3] ="kebap";

        for (String i:
             meals) {
            System.out.println(i);
        }
        System.out.println("-------");

//        Son listeyi tersten ekrana yazdırınız.

        for (int i = meals.length-1; i >= 0; i--) {
            System.out.println(meals[i]);

        }

































    }


}
