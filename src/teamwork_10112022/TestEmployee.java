package teamwork_10112022;


public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kenan", 2000, 45, 1985);
        System.out.println(emp1);
        System.out.println("Bonusu: " + emp1.bonus());
        System.out.println("Maaş artışı : "+ emp1.raiseSalary());
        System.out.println("Toplam ücret: "+ (emp1.salary + emp1.bonus() + emp1.raiseSalary()));

//    Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan
//    bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 4 metoda sahip olacaktır.
//
//    Sınıfın Nitelikleri
//
//    1-name : Çalışanın adı
//    2-salary : Çalışanın maaşı
//    3-workHours : Haftalık çalışma saati
//    4-hireYear : İşe başlangıç yılı
//
//    Sınıfın Metotları
//
//    1-Employee(name,salary,workHours,hireYear) : Kurucu(constructor) metot olup 4 parametre alacaktır.
//    2-bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak
//    şekilde bonus ücretleri hesaplayacaktır.
//    3-raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuanki yılı 2022 olarak alın.
//    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
//    Eğer çalışan 10 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
//    Eğer çalışan 20 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
//    4-toString() : Çalışana ait bilgileri ekrana bastıracaktır.

    }
}
