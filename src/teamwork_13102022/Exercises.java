package teamwork_13102022;

public class Exercises {
    public static void main(String[] args) {
        // Data tipleri ve değişkenlerle ilgili aşağıdaki örnekleri yapınız.

        //        1. Matematik = 50, Fizik =56 , Kimya = 84 ve Türkçe=44 Dersleri için değişken ve değer belirleyerek
        //                not ortalaması yapan program yazınız
        //        2. Boy ve ağırlık değişkenleri ile vücut kitle indeksi hesaplayan program yazınız
        //        3. a=5 ve b=8 değerlerini b=8 ve a=5 e şeklinde reverse değiştirecek program yazın.




//       1)
//       double mat, fizik, kim, turkce;
//
//        mat= 50;
//        fizik = 56;
//        kim = 84;
//        turkce = 44;
//
//        double notOrtalamasi = ( mat + fizik + kim + turkce ) / 4;
//        System.out.println("Not ortalamanız: " + notOrtalamasi);

//      2)
//      double kilo, boy, vucutIndeks;
//
//        kilo = 105;
//        boy =  1.72;
//        vucutIndeks= kilo / (boy * boy);
//        System.out.printf("Vücut indeksiniz :" + "%5.3f", vucutIndeks);

        int a= 5, b=8;
        int gecici = a;
        a = b;
        b = gecici;

        System.out.println(a);
        System.out.println(b);


    }


}
