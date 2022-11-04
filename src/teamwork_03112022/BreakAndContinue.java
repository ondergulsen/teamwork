package teamwork_03112022;

public class BreakAndContinue {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.print(i + " ");
//
//        }
//        System.out.println();
//
//
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.print(i + " ");
//        }



//        Create a program to write the even numbers from 10 to 20, both included, except 16, in 3 different ways:
//
//        - Incrementing 2 in each step (use "continue" to skip 16)
        for (int i = 10; i <=20 ; i+=2) {
            if (i==16){
                continue;
            }
            System.out.print(i + " ");

        }

//        - Incrementing 1 in each step (use "continue")
        for (int i = 10; i <=20 ; i++) {
            if(i%2 == 0) {
                if (i == 16) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }

//        - With and endless loop (using "break" & "continue")

    for (int i = 10;  ; i++) {
        if(i%2 == 0) {
            if (i == 16) {
                continue;
            }

            if (i>20){
                break;
            }
            System.out.print(i + " ");
        }
    }
}}

