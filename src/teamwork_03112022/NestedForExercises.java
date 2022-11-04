package teamwork_03112022;

public class NestedForExercises {
    public static void main(String[] args) {

//        TODO 1 Use a for loop (outer) to print headings for four weeks (Weeks 1 - 4).
//         Then use another for loop (inner) to print the days (Days 1 -7) for each week.

//        Hafta 1
//            Gün 1
//            Gün 2
//                ...
//        Hafta 2
//            Gün 1
//            Gün 2
//                ...

//       TODO 2 Use nested loops to print a rectangle of asterisks that is 8 columns by 3 rows.

//        ********
//        ********
//        ********


//        TODO 3 Use nested loops to print a triangle made of nine rows.
//         Each row should consist of numbers.
//         The first row should contain one 1, the second two 2's, the third three 3's, etc.

//            1
//            22
//            333
//                    ...
//
//            999999999


// TODO 4 Aşağıdaki deseni nested for loops ile oluşturunuz.


// #
//  #
//   #
//    #
//     #
//      #

        String text = "Good morning, Have a good class. ";

        String[] words = text.split("[ \n\t\r.,;:!?(){]");

        for (String kelime:
             words) {
            System.out.println(kelime);

        }

    }
}
