package teamwork_15122022;


import java.util.*;


public class ArrayListTask {
    public static void main(String[] args) {


        //TODO 1 _ 4 elemanlı bir hayvan Array listesi oluşturalım;
        // Bu listenin 2.indeksine "fil" ekleyelim.
        // Bu listenin uzunluğunu bulalım.
        // Listenin 1ve 3 . sıradaki hayvanı print edelim
        // listenin son sırasındaki hayvanı "Aslan" olarak değiştirelim.
        // Listenin ilk elemanını çıkaralım.
        // Listeden "fili" çıkaralım.
        // lİstenin "kedi" içerip içermediğini kontrol edelim.
        // Listenin son halini for, foreach, iterable ve lambda ile 4 farklı yöntemle yazdıralım.

        ArrayList<String> hayvanListesi = new ArrayList<>();

        hayvanListesi.add("aslan");
        hayvanListesi.add("yılan");
        hayvanListesi.add("kedi");
        hayvanListesi.add("kaplan");

        hayvanListesi.add(2, "fil");
        System.out.println(hayvanListesi.size());

//        for (int i = 0; i < hayvanListesi.size(); i++) {
//            System.out.println(hayvanListesi.get(i));
//
//        }
//        System.out.println();
//        for (var hayvan: hayvanListesi) {
//            System.out.println(hayvan);
//        }
//        System.out.println();

//        Iterator<String> iterator = hayvanListesi.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        hayvanListesi.forEach(hayvan-> System.out.println(hayvan));

//        System.out.println(hayvanListesi.get(3));
//
//        hayvanListesi.set(hayvanListesi.size() - 1, "Aslan");
//        hayvanListesi.forEach(hayvan -> System.out.println(hayvan));
//        System.out.println();
//
//        hayvanListesi.remove(0);
//        hayvanListesi.forEach(hayvan -> System.out.println(hayvan));
//        System.out.println(hayvanListesi.size());
//
//        boolean silme = hayvanListesi.remove("fil");
//        hayvanListesi.forEach(hayvan -> System.out.println(hayvan));
//        System.out.println(silme);
//
//
//        boolean varMı = hayvanListesi.contains("kedi");
//        System.out.println(varMı);


//       TODO 2 Javada 1-100 arası random sayılarla 6 elemanlı bir Array list oluşturalım.
//        Bu listeyi yazdıralım.
//        Bu listenin toplamını ve ortalamasını bulalım.
//        Bu listedeki çift sayıları listeden çıkaralım.
//        Bu listedeki maks. numarayı bulalım?


        ArrayList<Integer> sayiListesi = new ArrayList<>();
        Random rnd = new Random();
        int toplam = 0;

        for (int i = 0; i < 6; i++) {
            int randomnum= rnd.nextInt(100);
            sayiListesi.add(randomnum);
            toplam+=randomnum;

        }
        for (var num:sayiListesi) {
            System.out.println(num);

        }

        System.out.println();
        System.out.println(toplam);


        System.out.println();
        System.out.println((double)toplam/ sayiListesi.size());

        System.out.println();

        sayiListesi.removeIf(num -> num % 2 == 0);

        for (var num:sayiListesi) {
            System.out.println(num);

        }
        System.out.println();

        int max= sayiListesi.get(0);
        for (var num:sayiListesi) {
            if (num > max){
                max=num;
            }

        }
        System.out.println(max);


    }

}