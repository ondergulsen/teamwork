package teamwork_22112022;

import java.util.Arrays;

public class Multi_Arrays {
    public static void main(String[] args) {

//     TODO 1 Declare and create a 3 by 3 two-dimensional int array named "table". The finished code will print the values 0 to 8.

//      int[][] table = new int[3][3];
//      table[0][0] = 0;
//      table[0][1] = 1;
//      table[0][2] = 2;
//      table[1][0] = 3;
//      table[1][1] = 4;
//      table[2][0] = 6;
//      table[2][1] = 7;
//      table[2][2] = 8;
//
//      int[][] table2 = {
//              {0, 1, 2},
//              {3, 4, 5},
//              {6, 7, 8},
//      };
//
////       System.out.println(Arrays.deepToString(table));
//
//      for (int row = 0; row < table.length; row++) {
//         for (int col = 0; col < table.length; col++) {
//            System.out.print(table[row][col] + " ");
//
//         }
//         System.out.println();
//
//       }

//      TODO 2  Loop through the given two-dimensional array, printing out the values
//        String[][] arr = { {"Hey ", "there! "},{"I ", "hope "},
//                          {"you ", "are "}, {"doing ", "well"} };


//       String[][] arr = {
//               {"Hey ", "there! "},
//               {"I ", "hope "},
//               {"you ", "are "},
//               {"doing ", "well"} };
//
//       for (int row = 0; row < 4; row++) {
//          for (int col = 0; col < 2; col++) {
//             System.out.print(arr[row][col]);
//
//          }
//          System.out.println();
//       }


//TODO 3 declare and initialize a two-dimensional String array called students with the names “Brice, Marvin, Anna” in the first row
// and “Kamal, Maria, Elissa” in the second.
// The finished code will print all the names in the array starting with all in the first row followed by all in the second row.

//       String [][] students = {
//               {"Brice", "Marvin", "Anna"},
//               {"Kamal", "Maria", "Elissa"}
//       };
//
//       for (int row = 0; row < 2; row++) {
//          for (int col = 0; col < 3; col++) {
//             System.out.print(students[row][col] + " ");
//
//          }
//       }


//      TODO 4  int[][] arr = { {47,3,12},{51,74,20} };
//        Print the values 47, 51, and 20 by accessing them in the the given two-dimensional array.
//       int[][] arr = {
//               {47,3,12},
//               {51,74,20}
//       };
//       System.out.println(arr[0][0] + " " + arr[1][0]+ " " + arr[1][2]);


//      TODO 5 Print the number of rows in the given two-dimensional array
//       Then print the number of columns.
//Ex. The array { {“hello”,”there”,”world”},{“how”,”are”,”you”} } should print:
//Rows: 2
//Columns: 3
//         String[][] str = {
//                 {"hello", "there", "world"},
//                 {"how", "are", "you"},
//                 {"what", "is", "your", "name"}};
//         System.out.println("Rows: " + str.length);
//         System.out.println("Columns :" + str[2].length);
//         System.out.println(str[2][3]);
//      TODO 6  Print out the sum of the numbers in the second row of the “table” array. It should print 18.
//         int[][] table = {
//                 {1,4,9},
//                 {11,4,3},
//                 {2,2,3} };
////       System.out.println( table3[1][0] + table3[1][1] + table3[1][2]);
//         int sum=0;
//         for (int i = 0; i < 3 ; i++) {
//             sum += table[2][i];
//
//
//            }
//            System.out.println(sum);
//
//                      Fiz             Kim                 Mat
//       İsimler    Vize    Final    Vize    Final    Vize    Final
//       Ahmet      46    68        74    79        93    98
//       Ayşe       32    62        37    59        63    35
//       Şengül      84    40       90    37        73    79

        System.out.println("\t\t Fiz\t\t Kim\t\t Mat");
        System.out.println(" ".repeat(8) + "-".repeat(30));
        System.out.println("İsim\tViz\tFin\t\tViz\tFin\t\tViz\tFin");
        System.out.println();
        String[] names = {"Ahmet", "Ayşe", "Şengül"};
        int[][][] notes = {
                {{46, 68}, {74, 79}, {93, 98}},
                {{32, 62}, {37, 59}, {63, 35}},
                {{84, 40}, {90, 37}, {73, 79}},
        };
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + "\t");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(notes[i][j][k] + "  ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}



