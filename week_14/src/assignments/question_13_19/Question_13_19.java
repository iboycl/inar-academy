package assignments.question_13_19;

import assignments.question_13_16.Rational;

public class Question_13_19 {
    public static void main(String[] args) {
        String decimal = "3.25";

        String[] nums = decimal.split("\\.");

        Rational r1 = new Rational(Integer.parseInt(nums[0]), 1);
        Rational r2 = new Rational((long) Integer.parseInt(nums[1]), (long) Math.pow(10, nums[1].length()));
        if (decimal.charAt(0) == '-'){
            r2 = r2.multiply(new Rational(1,-1));
        }


        System.out.println(r1.add(r2));
    }
}
