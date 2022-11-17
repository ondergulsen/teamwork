package teamwork_16112022.part2;

public class TestApp {
    public static void main(String[] args) {
//        Food sınıfı tanımlayacağız.  Fruit sınıfını bu sınıftan ve Apple, Orange sınıflarını Fruit sınıfından oluşturacağız.
//        Her sınıfta getTotalCalories(); ve  getOrigin() metotları olacak.
//        Fruitler için kalori=0.50 ike Apple için 0.40 ve Orange için 0.30dır. Origin Apple için Amasya ve Orange için Antalya'dır.
//        1-Fruit, orange ve apple sınıfından birer nesne oluşturarak kalori ve originleri gösteriniz.
//        2-Food sınıfında referanslı bir fruit ve apple nesnesi oluşturunuz. kalori ve origin gösteriniz.
//        3-Fruit sınıfından referanslı bir orange nesnesi oluşturup kalori ve origin gösteriniz.

        Fruite fruit= new Fruite();
        Orange orange1= new Orange();
        Apple apple1= new Apple();

        System.out.println(fruit.getOrigin());
        System.out.println(fruit.getTotalCalories());

        System.out.println(orange1.getOrigin());
        System.out.println(orange1.getTotalCalories());

        System.out.println(apple1.getOrigin());
        System.out.println(apple1.getTotalCalories());

        System.out.println();

        Food fruit2= new Fruite();
        Food apple2= new Apple();

        System.out.println(((Fruite)fruit2).getOrigin());
        System.out.println(((Fruite)fruit2).getTotalCalories());

        System.out.println(((Apple)apple2).getOrigin());
        System.out.println(((Apple)apple2).getTotalCalories());

        System.out.println();
        Fruite orange2= new Orange();
        System.out.println(((Orange)orange2).getOrigin());
        System.out.println(((Orange)orange2).getTotalCalories());

    }
}
