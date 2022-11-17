package teamwork_17112022;

import java.util.Arrays;
import java.util.Random;

public class TestApp {
    public static void main(String[] args) {


//        Create a class named "IronBar", it contains private length and public ShowData() method.
//        Use constructors to store field.
//        In it, create a class "ShortBar" and a class "LongBar" that inherits from "IronBar".
//        Their methods "ShowData", besides writing the length, must display "(This is Short/Long iron bar)."
//        Create an array that contains 5 long bar and 5 short bar. The  long bars must have random sizes
//        between 121 and 200 cm, and the short bars from 40 to 120 cm. Show all their datas.












        IronBar[] myTables = new IronBar[10];
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            if ((i % 2 == 0) & (i != 1)) {
                myTables[i] = new LongBar(rnd.nextInt(121, 200));
                System.out.println(myTables[i].showData());
            } else {
                myTables[i] = new ShortBar(rnd.nextInt(40, 120));
                System.out.println(myTables[i].showData());
            }
        }
    }
}
