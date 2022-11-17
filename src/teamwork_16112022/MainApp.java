package teamwork_16112022;

public class MainApp {
    public static void main(String[] args) {
        Araba car1= new Araba();
        YarisAraba raceCar1= new YarisAraba();
        Araba raceCar2= new YarisAraba();

        car1.ilerle();
        raceCar1.ilerle();
        raceCar2.ilerle();
        System.out.println();

        raceCar1.turbo();
        ((YarisAraba)raceCar2).turbo();
    }
}
