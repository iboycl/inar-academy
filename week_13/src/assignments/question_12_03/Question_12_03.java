package assignments.question_12_03;

import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ar = new int[100];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
        }
        System.out.print("Enter the index of the array: ");
        boolean noEx = true;
        do {
            try {
                int index = input.nextInt();
                System.out.println("You chose: " + ar[index]);
                noEx = false;
            } catch (ArrayIndexOutOfBoundsException ex){

                System.out.println(
                        "Out of Bounds.!! Try another index between 0 -100"
                );
                input.nextLine();
            }
        } while (noEx);
    }
}
