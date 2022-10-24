package teamwork_24102022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        Programda kullanıcı adı(username) "tester" ve parola (password) "1234" olarak tanımlanacaktır.
//        Kullanıcıdan kullanıcı adı ve parola verileri alarak;
//
//        1. Kullanıcı adı yanlış ise "sistemde kayıtlı değilsiniz." yazdıracak.
//        2. Parola yanlış ise "Parolanız yanlış" "Şifrenizi sıfırlamak ister misiniz?" diye soracak.
//        3. Kullanıcı sıfırlamak isterse, girdiği şifrenin unuttuğu eski şifre ile aynı olmaması gerektiğini kontrol edip ,
//        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." uyarısı verecek
//        4. Sorun yoksa " Şifre oluşturuldu." yazacak.
//
//        bir program yazınız. Not(for/ while döngüsü kullanılmayacak)

        String username = "tester";
       String password  = "1234";

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adını giriniz: ");
        String user1= input.nextLine();
        System.out.println("Lütfen parolanızı giriniz: ");
        String pas1= input.nextLine();

        if (user1.equals("tester") & pas1.equals(password)){
            System.out.println("Hoşgeldiniz " + username);
        }else if (!(user1.equals("tester"))){
            System.out.println("Sistemde kayıtlı değilsiniz.");
        }else if (!(pas1.equals(password))) {
            System.out.println("Parolanız yanlış. Şifrenizi sıfırlamak isterseniz -Evet- yoksa -Hayır- yazınız: ");
            String reply = input.nextLine();
            if(reply.equals("Evet")){
                System.out.println("Lütfen yeni şifrenizi giriniz: ");
                String newpsw = input.nextLine();
                    if (newpsw.equals(password)){
                        System.out.println("Şifreniz oluşturulamadı. Lütfen yeni şifre giriniz");
                    }else {
                        System.out.print("Şifre oluşturuldu. ");
                        password = newpsw;
                        System.out.printf("Yeni parolanız: %d\t ile giris yapınız", password);
                    }
            }else if(reply.equals("Hayır")){
                System.out.println("Giriş iptal edildi.");
            }else{
                System.out.println("Geçersiz yanıt.");
            }
        }
    }
}
