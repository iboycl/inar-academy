import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int total = 0;
        int count = 0;

        String msg = "Enter an integer, the input ends if it is 0: ";
        System.out.print(msg);
        int number = input.nextInt();

        while (number != 0){

            if ((number > 0)) {
                positive++;
            } else {
                negative++;
            }
            total += number;
            count++;

            number = input.nextInt();

        }
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The total is " + total);
            System.out.println("The average is " + (total / (double) count));
        }
    }
}
