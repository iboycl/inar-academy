package assignments.question_13_15;

import java.math.BigInteger;

public class Rational2 extends Number implements Comparable<Rational2>{
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational2() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational2(long numerator, long denominator) {
        this(BigInteger.valueOf(numerator), BigInteger.valueOf(denominator));
    }

    public Rational2(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator.abs(), denominator.abs());
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
        if (this.denominator.compareTo(BigInteger.ZERO) < 0) {
            this.numerator = this.numerator.negate();
            this.denominator = this.denominator.negate();
        }
    }

    private BigInteger gcd(BigInteger a, BigInteger b) {
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger temp = b;
            b = a.mod(b);
            a = temp;
        }
        return a;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational2 add(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    public Rational2 subtract(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    public Rational2 multiply(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    public Rational2 divide(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Rational2(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator.toString();
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rational2)) {
            return false;
        }
        Rational2 otherRational = (Rational2) other;
        return numerator.equals(otherRational.getNumerator()) &&
                denominator.equals(otherRational.getDenominator());
    }

    @Override
    public int compareTo(Rational2 o) {
        BigInteger thisValue = numerator.multiply(o.getDenominator());
        BigInteger otherValue = o.getNumerator().multiply(denominator);
        return thisValue.compareTo(otherValue);
    }

    @Override
    public int intValue() {
        return numerator.divide(denominator).intValue();
    }

    @Override
    public long longValue() {
        return numerator.divide(denominator).longValue();
    }

    @Override
    public float floatValue() {
        return numerator.floatValue() / denominator.floatValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}

