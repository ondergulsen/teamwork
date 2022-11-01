package teamwork_01112022;

import java.util.Scanner;

public class ArraysTasks2 {
    public static void main(String[] args) {
        //Write some Java code that stores the numbers from 1 to 19 in an array.

//        int [] numList= new int[19];
//        for (int i = 0; i < numList.length; i++) {
//            numList[i] = (i + 1);
//
//
//        }
//        for (int num:
//             numList) {
//            System.out.print(num +" ");
//        }





        // 2 'den 20 ye kadar çift sayıları içeren bir liste oluşturun.

//        int [] numList2= new int[10];
//        for (int i = 0; i < numList2.length; i++) {
//            numList2[i] = (i + 1) * 2;
//
//
//        }
//        for (int num:
//                numList2) {
//            System.out.print(num +" ");
//        }


        //Write some Java code that asks the user how many numbers they want to store.
        //Based on their answer, you should create an integer array of the correct size.
        //Then ask the user to enter the numbers and store them in the array you created.
        //Finally, print out the contents of the array.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Kaç tane numara gireceksiniz: ");
//        int length = input.nextInt();
//        int [] newList= new int[length];
//        for (int i = 0; i < newList.length; i++) {
//            System.out.println(i+1 + ". Numarayı giriniz");
//            newList[i]=input.nextInt();
//        }
//        for (int num:
//             newList) {
//            System.out.print(num + " ");
//
//        }


        //Write some Java code that stores the numbers 11 - 20 (inclusive) in an array, add them up, print the total and find average of these numbers.

        int [] myList = new int[10];
        int sum=0;
        double average;
        for (int i = 0; i < myList.length; i++) {
            myList[i] = i +11;
            sum +=myList[i];

        }
        average = (double)sum / myList.length;
        System.out.printf("Toplam: %2d | Ortalama: %5.2f", sum , average);




    }
}
