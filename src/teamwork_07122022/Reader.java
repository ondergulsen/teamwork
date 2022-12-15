package teamwork_07122022;

import java.io.File;
import java.util.Scanner;

public class Reader{
    public static void main(String[]args){
        System.out.println("Lütfen bulmak istediğiniz dosyanın ismini giriniz:");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        File myFile = new File(fileName);

        try{
            if(myFile.exists()){
                System.out.println(fileName + "' dosyası bulundu. Silmek istiyor musunuz? (E/H)");
                String answer = input.nextLine();

                if(answer.equals("E")){
                    myFile.delete();
                    System.out.println(fileName + "' dosyası başarıyla silindi.");
                }
            }
            else{
                System.out.println(fileName + "' dosyası bulunamadı.");
            }
        }
        catch(Exception ex){
            System.out.println("Bir hata oluştu: " + ex.getMessage());
        }
    }
}
