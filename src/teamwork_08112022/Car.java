package teamwork_08112022;

public class Car {
    int yearModel;
    String color;
    int speed;

    void Accelarate(){
        this.speed += 5;
    }
    void Brake(){
        this.speed -= 5;
    }
    void showInfo(){
        System.out.printf("Araba modeli: %d, Araba rengi: %s, Arabanın Ort. hızı: %d", yearModel, color, speed );
    }

}
