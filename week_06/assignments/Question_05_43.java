package week_06.assignments;

public class Question_05_43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (j == i) continue;
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);

        int count2 = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = i+1; j <= 7; j++) {
                    System.out.println(i + " " + j);
                count2++;
            }
        }
        System.out.println("The total number of all combinations is " + count2);
    }
}
