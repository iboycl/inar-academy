package assignments.question_13_15;

import live_class.Rational1;

public class Question_13_15 {
    public static void main(String[] args) {
        Rational1 r1 = new Rational1(5,6);
        Rational1 r2 = new Rational1(1, 4);

        System.out.println(
                r1 + " + " + r2 + " = " + r1.add(r2) + "\n" +
                        r1 + " - " + r2 + " = " + r1.subtract(r2) + "\n" +
                        r1 + " * " + r2 + " = " + r1.multiply(r2) + "\n" +
                        r1 + " / " + r2 + " = " + r1.divide(r2) + "\n" +
                        r2 + " is " + r2.doubleValue()
        );
    }
}
