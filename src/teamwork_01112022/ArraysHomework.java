package teamwork_01112022;

public class ArraysHomework {
    public static void main(String[] args) {
        //Store grades of twelve students in an integer array variable. Write a Java program that finds the average of these grades.
        //grades: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45
        //average?

        int [] grades = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        int sum =0;

        for (int i:
             grades) {
            sum+=i;

        }
        System.out.println("notlar toplamı: " + sum);
        double avg= (double)sum / grades.length;
        System.out.printf("Not ortalaması: %5.2f ", avg);
    }
}
