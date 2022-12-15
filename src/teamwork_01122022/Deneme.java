package teamwork_01122022;

import javax.swing.JOptionPane;

public class Deneme {
    public static void main(String[] args) {
        try {
            String name = JOptionPane.showInputDialog("Lütfen isminizi giriniz: ");
                name = name.toUpperCase();
                System.out.println("Merhaba " + name);
                System.out.println(name.charAt(-1));
        } catch (NullPointerException ex) {
            System.out.println("Hata: İsim Girmediniz!" +ex.getMessage());
        }
    }
}
