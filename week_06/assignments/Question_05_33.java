package week_06.assignments;

public class Question_05_33 {
    public static void main(String[] args) {
        for (int i = 6; i < 10000; i++) {
            int divisors = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0){
                    divisors += j;
                }
            }
            if (divisors == i) System.out.println(i);
        }
    }
}
