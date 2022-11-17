package teamwork_16112022;

public class YarisAraba extends Araba{
    void turbo(){
        System.out.println("Yarış arabası uçuyor.");
    }

    @Override
    void ilerle() {
        System.out.println("Yarış arabası hızla ilerliyor");;
    }
}
