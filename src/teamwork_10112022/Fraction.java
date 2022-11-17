package teamwork_10112022;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            this.denominator = denominator;
        }
    }

    public String display() {
        return "Numerator is: " + this.numerator + " Denominator is: " + this.denominator +
                " Your fraction is: " + (this.numerator + "/" + this.denominator);
    }

    public boolean equals(Fraction other) {
        int num1 = this.numerator * other.getDenominator();
        int num2 = this.denominator * other.getNumerator();
        return num1 == num2;
    }
}


