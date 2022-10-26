package teamwork_26102022;

public class MathMethods {
    public static void main(String[] args) {
        int x = 8;
        int y = 4;
        int z = -10;
        double a= 4.39;
        String str = "Merhaba yeni Dünya";

        //return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));

        //return the maximum of two numbers
        System.out.println("Minimum number of x and y is: " +Math.min(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 8 power of 4 i.e. 8*8*8*8
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        //return the Absolute value of the given value.
        System.out.println("Absolute value of z is: " + Math.abs(z));

        //Math.round() used to round of the decimal numbers to the nearest value.
        System.out.println("Round decimal number is: " + Math.round(a));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


    }
}
