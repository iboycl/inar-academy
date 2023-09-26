import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");

        int number = input.nextInt();
        int space = number - 1;

        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            space--;
            for (int j = i; j > 1; j--) {
                System.out.printf("%d ", j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf(j == i ? "%d\n" : "%d ", j);
            }

        }
    }
}
