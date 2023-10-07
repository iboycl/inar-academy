import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();

        System.out.print("The distinct numbers are: ");

        for (int num : eliminateDuplicates(numbers)) if (num > 0) System.out.print(num + " ");
    }

    public static int[] eliminateDuplicates(int[] numbers){
        int[] distinct = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            boolean different = true;
            for (int k : distinct) if (numbers[i] == k) different = false;

            if (different) distinct[i] = numbers[i];
        }
        return distinct;
    }

}
