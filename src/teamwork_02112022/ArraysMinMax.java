package teamwork_02112022;

public class ArraysMinMax {
    public static void main(String[] args) {
        // Aşağıdaki listenin en büyük ve en küçük değerlerini bulunuz.

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int max = list[0];
        int min = list[0];

        for (int num:
             list) {
            if (num > max){
                max=num;
            }
        }
        for (int num2:
             list) {
            if (num2<min){
                min=num2;
            }

        }
        System.out.println("Maksimum değer: " + max);
        System.out.println("Minimum değer: " + min);

    }
}
