package teamwork_25112022;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        if (n > 1000 | n < 0) {
            System.out.println("n sayısı 1000 den büyük ve negatif olamaz");
            System.err.println("Hatalı giriş yaptınız!");
            System.exit(0);
        }
        int sum = 0;
        int sayac;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;

    }
}

 interface AdvancedArithmetic {
    int divisor_sum(int n);
}
 class TestApp {
    public static void main(String[] args) {

        MyCalculator calc1= new MyCalculator();
        System.out.println(calc1.divisor_sum(15));

    }
}

