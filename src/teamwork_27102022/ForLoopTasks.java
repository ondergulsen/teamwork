package teamwork_27102022;

import java.util.Scanner;

public class ForLoopTasks {
    public static void main(String[] args) {


//        Task 1:
//        0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)

//        for (int i = 0; i <=20 ; i++) {
//            if (i%2==0){
//                System.out.print(i + " ");
//            }
//
//
//        }


//
//        Task 2:
//        0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.
//        int toplam = 0;
//        for (int i = 0; i <= 20 ; i++) {
//            if (i%2 ==1){
//                toplam += i;
//
//            }
//
//        }
//        System.out.println("Toplam: " + toplam);

//
//        Task 3:
//        0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran Java
//        programını yazınız. (Sıfır ve yüz dahil)

//        for (int i = 0; i <= 100 ; i++) {
//            if (i%10 == 0){
//                System.out.print(i + " ");
//            }
//
//        }


//        TODO 1 Write some code that asks the user how many slices of pizza they want.
//         Your program must print the word PIZZA the required number of times.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Kaç dilim pizza istiyorsunuz!: ");
//        int slice = input.nextInt();
//        for (int i = 1; i <= slice ; i++) {
//            System.out.println(i + " PİZZA");
//
//        }






//        TODO 2 Write some code that counts down from 10 to 1, and then prints the words Blast Off!

//        for (int i = 10; i >= 1 ; i--) {
//            System.out.println(i);
//        }
//        System.out.println("Blast Off!");








//        TODO 3 Write a program that displays the numbers from 1 to 10 and their squares.
//         Output : 1 -> 1, 2 -> 4, 3 -> 9,

//        System.out.println("Number\tNumber Squared");
//        for (int i = 1; i <= 10; i++) {
//            int kare= i * i;
//
//            System.out.println(i + " \t->\t " + kare);
//
//        }


//
//        TODO 3-1 Write a program that displays the numbers from 5 to 10 and sum of their squares.
//        int toplam =0;
//        for (int i = 5; i <= 10; i++) {
//            int kare= i * i;
//            toplam+=kare;
//
//
//        }
//        System.out.println(toplam);


//       TODO 4 Write a program that displays the three times table (multiplication table).
        // 1 * 3= 3
        // 2 * 3 =6
        // 3 * 3 =9

//        for (int i = 1; i <=10 ; i++) {
//            int mult = i* 3;
//            System.out.println(i + "x" + "3 \t= " + mult);
//
//        }





//       TODO 5 Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program.
        //output : scanner input: 5 , 2 üzeri 5 e kadar yazdıracak

//        Scanner input = new Scanner(System.in);
//        System.out.println("Üs sayısını yazınız!: ");
//        double sqr=0;
//        int n = input.nextInt();
//        for (int i = 0; i <= n ; i++) {
//            sqr=Math.pow(2,i);
//            System.out.println("2 üzeri "+ i + " = " + sqr);
//
//        }





//       TODO 6 Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
//         ve bu sayıları ekrana yazan programı yazın.
        // 5 10 25 45 50 ; max 50 min 5


//                Scanner inp = new Scanner(System.in);
//                int number, n, largestNumber = Integer.MAX_VALUE, smallestNumber = Integer.MIN_VALUE;
//                System.out.println("Please enter how many numbers to enter: ");
//                n = inp.nextInt();
//
//                for (int i = 1; i <= n; i++) {
//                    System.out.println("Please enter " + i + ". number:");
//                    number = inp.nextInt();
//                    if (i == 1) {
//                        largestNumber = number;
//                        smallestNumber = number;
//                    } else {
//                        if (number > largestNumber) {
//                            largestNumber = number;
//                        } else if (number < smallestNumber) {
//                            smallestNumber = number;
//                        }
//                    }
//                }
//                System.out.println("The largest number is :" + largestNumber);
//                System.out.println("The smallest number is :" + smallestNumber);


            }
        }







