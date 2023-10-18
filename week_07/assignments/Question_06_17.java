import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = input.nextInt();
        printMatrix(n);
        
    }

    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int random = (int)(Math.random() * 2);
                System.out.printf(j == n - 1 ? "%d\n" : "%d ",random);
            }
        }
    }
}
