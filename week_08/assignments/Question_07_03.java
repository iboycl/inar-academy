import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];
        System.out.print("Enter the integers between 1 and 100: ");
        int n = -1;
        while (n != 0){
            n = input.nextInt();
            numbers[n]++;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > 0) System.out.println(i + " occurs " + numbers[i] + (numbers[i] > 1 ? " times" : " time"));
        }

    }
}
