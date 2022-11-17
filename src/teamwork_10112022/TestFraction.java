package teamwork_10112022;

import java.util.Scanner;

public class TestFraction {
    public static void main(String[] args) {
//        Define a class named Fraction. This class is used to represent the ratio of two integers.
//        A fraction consists of two private integers, one for numerator and one for denominator.
//        An example fraction is 3/4.
//        A valid fraction must not have zero in the denominator. Create two constructor(), set(), get() and
//        display() methods.
//        It includes an additional method, equals(), that takes another Fraction as input from user and returns
//        true if the two fractions are the same, or false otherwise.

        Fraction fraction1= new Fraction(3,0);
        System.out.println(fraction1.display());

        Fraction fraction2 = new Fraction();
        System.out.print("Enter your Fraction's Numerator: ");
        fraction2.setNumerator(new Scanner(System.in).nextInt());
        System.out.print("Enter your Fraction's Denominator: ");
        fraction2.setDenominator(new Scanner(System.in).nextInt());

        System.out.println("These fractions are equal: " + fraction1.equals(fraction2));

    }
}
