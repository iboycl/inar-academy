import java.util.Scanner;

public class Question_05_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tuition = input.nextDouble();
        double rate = input.nextDouble();
        double sum = 0;

        for (int i = 0; i < 13; i++) {
            tuition += tuition * rate;
            System.out.println(tuition);

            if( i == 9) {
                System.out.println("Tuition in ten years:" + tuition);
            }
            if (i > 8) {
                sum += tuition;
            }
        }
        System.out.println("Total cost for four years' worth of tuition after tenth year:" + sum);
    }
}
