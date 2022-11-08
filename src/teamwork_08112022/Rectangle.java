package teamwork_08112022;

public class Rectangle {
    int shortLength;
    int longLength;



    void area(){
        System.out.println("Dikdörtgenin alanı: " + (shortLength * longLength));
    }

    void perimeter(){
        System.out.println("Dikdörtgenin çevresi: " + ( 2 * (shortLength + longLength)));
    }
}
