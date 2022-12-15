package teamwork_07122022;

//TASK!!! Bir student sınıfında private yaş, ad ve no alanları tanımlayıp, eğer yaş 0 dan küçükse ve String name
// boş olarak girilirse ilgili ve olası hataları throwsla yakalayan bir program yazın, main metodunda 3 öğrenci
// oluşturarak hataları ekranda gösterin.


public class Test {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(18, "   ", 1);
            Student student2 = new Student(-5, "John", 2);
            Student student3 = new Student(20, "Jane", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

