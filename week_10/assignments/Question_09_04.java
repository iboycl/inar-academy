package week_10.assignments;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random1 = new Random(1000);

        System.out.println("Random numbers are: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(random1.nextInt(100) + " ");
            }
            System.out.println();
        }

    }
}
