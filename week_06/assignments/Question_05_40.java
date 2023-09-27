package week_06.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000000; i++) {
            if ((int) (Math.random() * 2) == 1){
                heads++;
            } else {
                tails++;
            }
        }


        System.out.printf("Flipping a coin one million times..\nHeads: %d\nTails: %d", heads, tails);
    }
}
