import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] list1 = new int[10];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length; j++) {
                if (i == j) continue;
                System.out.println(list1[i] + " " +list1[j]);
            }
        }

    }
}
