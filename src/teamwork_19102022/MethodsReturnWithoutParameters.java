package teamwork_19102022;

public class MethodsReturnWithoutParameters {
    public static void main(String[] args) {
        int x = Toplama() * Toplama();
        System.out.println(x);

    }
    public static int Toplama() {
        int a = 10;
        int b = 15;
        int toplam = a+b;
        return toplam;
    }
}
