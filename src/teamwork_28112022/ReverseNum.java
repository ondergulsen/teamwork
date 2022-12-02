package teamwork_28112022;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(isPalindrom(12345));
        System.out.println();
        System.out.println(isPalindrom(101));
    }
    public static boolean isPalindrom(int numFirst) {
        int num=numFirst;
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return numFirst == reverse;
    }
}
