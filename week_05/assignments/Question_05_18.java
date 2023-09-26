import java.util.Scanner;

public class Question_05_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines");

        int number = input.nextInt();

        System.out.println("Pattern A");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i == 1 ? j : j + " ");
                if (j == i) System.out.println();
            }
        }

        System.out.println("--------------------------------------");

        System.out.println("Pattern B");
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j == number ? j : j + " ");
                if (j == i) System.out.println();
            }
        }

        System.out.println("--------------------------------------");

        System.out.println("Pattern C");
        int space = number;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i == 1 ? j : j + " ");
                if (j == i) System.out.println();
            }
            space--;
        }

        System.out.println("--------------------------------------");

        System.out.println("Pattern D");
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j == number ? j : j + " ");
                if (j == i) System.out.println();
            }
        }
    }
}
