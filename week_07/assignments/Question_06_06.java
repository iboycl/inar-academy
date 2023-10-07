import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");

        int number = input.nextInt();
        displayPattern(number);
    }

    public static void displayPattern(int number){
        int space = number - 1;

        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            space--;
            for (int j = i; j >= 1; j--) {
                System.out.printf(j == 1 ? "%d\n" : "%d ", j);
            }
        }
    }
}
