package live_class;

public class Rational1 extends Number implements Comparable<Rational1>{
    private long[] r = new long[2];

    public Rational1(){
        this(0, 1);
    }

    public Rational1(long numerator, long denominator){
        long gcd = gcd(numerator, denominator);
        this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.r[1] = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d){
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        return gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Rational1 add (Rational1 secondRational1){
        long n = r[0] * secondRational1.getDenominator()
                + r[1] * secondRational1.getNumerator();
        long d = r[1] * secondRational1.getDenominator();
        return new Rational1(n, d);
    }


    public Rational1 subtract (Rational1 secondRational1){
        long n = r[0] * secondRational1.getDenominator()
                - r[1] * secondRational1.getNumerator();
        long d = r[1] * secondRational1.getDenominator();
        return new Rational1(n, d);
    }

    public Rational1 multiply (Rational1 secondRational1){
        long n = r[0] * secondRational1.getNumerator();
        long d = r[1] * secondRational1.getDenominator();
        return new Rational1(n, d);
    }

    public Rational1 divide (Rational1 secondRational1){
        long n = r[0] * secondRational1.getDenominator();
        long d = r[1] * secondRational1.getNumerator();
        return new Rational1(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override
    public boolean equals (Object other) {
        if ((this.subtract((Rational1)(other))).getNumerator() == 0)
            return true;
        else
            return false;
    }
    @Override
    public int compareTo(Rational1 o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else
        return 0;
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }
}
