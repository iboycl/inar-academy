package assignments.question_13_17;

public class Complex implements Cloneable{
    private double a;
    private double b;

    public Complex() {
        this(0,0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getRealPart() {
        return a + "";
    }

    public String getImaginaryPart() {
        return b + "i";
    }

    String add(Complex c) {
        return (a + c.a) + " + " + (b + c.b) + "i";
    }

    String subtract(Complex c) {
        return (a - c.a) + " + " + (b - c.b) + "i";
    }

    String multiply(Complex c) {
        return (a * c.a - b * c.b) + " + " + (b * c.a + a * c.b) + "i";
    }

    String divide(Complex c) {
        return ((a * c.a + b * c.b) / (Math.pow(c.a, 2) + Math.pow(c.b, 2))) + " + " + ((b * c.a - a * c.b) / (Math.pow(c.a, 2) + Math.pow(c.b, 2))) + "i";
    }

    double abs () {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        return b != 0 ? "(" + a + " + " + b + "i)" : "(" + a + ")";
    }

    @Override
    public Complex clone() {
        try {
            return (Complex) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
