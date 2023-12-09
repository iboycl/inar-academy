package assignments.question_13_18;

import assignments.question_13_15.Rational2;

public class Question_13_18 {
    public static void main(String[] args) {
        /*Rational r1 = new Rational(1,2);

        for (int i = 2; i < 100; i++) {
            Rational r2 = new Rational(i, i+1);
            System.out.println(r2);
            r1 = r1.add(r2);
        }*/

        Rational2 r1 = new Rational2(1,2);

        for (int i = 2; i < 100; i++) {
            Rational2 r2 = new Rational2(i, i+1);
            System.out.println(r2);
            r1 = r1.add(r2);
        }
        System.out.println(r1);
    }
}
