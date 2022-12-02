package teamwork_19_20112022;
import java.util.Scanner;
public class MainApp {
    public static void isimDegistir(String name, String surname, int age) {
        System.out.println(name + " " + surname + " " + age);
    }
    public static String soyisimDegistir(String surname) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yeni soyisim giriniz: ");
        surname = input.nextLine();
        return surname;
    }
    public static void main(String[] args) {

        String name = "Tamer";
        String surname = "Aydin";
        int age = 14;
        System.out.println(name + " " + surname + " " + age);

        isimDegistir("Ahmet", "Akıl", 18);

        surname = soyisimDegistir(surname);
        System.out.println(name + " " + surname + " " + age);

        OgretmenBilgileri ogretmen = new OgretmenBilgileri();
        ogretmen.teacher_name = "Ertan";
        ogretmen.teacher_surname = "Aslan";
        ogretmen.age = 45;
        System.out.println(ogretmen);
    }
}
