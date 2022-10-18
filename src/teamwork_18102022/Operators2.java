package teamwork_18102022;

public class Operators2 {
    public static void main(String[] args) {
//        int a = 10;



//        //Unary Operators (Increment-Decrement)
//        System.out.println ( a++ ); //a =11 pr 10
//        System.out.println ( ++a ); //a =12 pr 12
//        System.out.println ( a-- ); //a= 11 pr 12
//        System.out.println ( --a ); //a=10 pr 10
//
//        System.out.println("-------------------");
//
//        int num= 50;
//        num= --num + num++ + num-- + num++; //49 + 49 + 50 + 49
//        System.out.println(num);
//
//        int num2= 1;
//        num2= -num2-- + num2++ / -num2-- * --num2; //  1  +  -2  / -2 * -2
//        System.out.println(num2);
//
//        int x= 4;
//        int y = ++x * 4 - x++;
//        System.out.println(y);

//        int x = 10;
//        int b = 20;
//
//        //Assignment Operators
//
//        System.out.println ( b += x );
//        System.out.println ( b -= x );
//        System.out.println ( b *= x );
//        System.out.println ( b /= x );
//        System.out.println ( b %= x );

        //Relational Operator:

//        int  a = 30;
//        int  b = 20;
//        System.out.println ( a < b );
//        System.out.println(  a > b );
//        System.out.println ( a <= b );
//        System.out.println (a >= b );
//        System.out.println ( a == b );
//        System.out.println ( a != b );
//        System.out.println("a sayısı b sayısından küçüktür: " + (a<b));
//        System.out.println("a sayısı b sayısından büyüktür: " + (a>b));

        // a ve b iki değişken tanımlayarak hangisinin küçük oldğunu ekrana yazdırınız.

//        if (a<b){
//            System.out.println("a sayısı küçüktür");
//        }
//        else{
//            System.out.println("b sayısı küçüktür");
//        }


//        System.out.println((a<b) ? "a küçük sayıdır." : "b küçük sayıdır."); // ? = ise , : = değilse (ternary operator)


        //logical operators
        int a = 5;
        System.out.println ( a<5  &&  a<20 ); // false && false = false
        System.out.println ( a<5 || a<20 ); // false || true = true
        System.out.println ( ! ( a<5  &&  a<20 )); //  ! ( false && true) = true



    }
}
