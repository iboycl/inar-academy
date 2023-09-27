package week_06.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers (it ends with input of 0): ");
        int num = -1;
        int max = 0;
        int count = 0;
        while (num != 0){
            num = input.nextInt();
            if (num == max){
                count++;
            }
            if(num > max) {
                max = num;
                count = 1;
            }
        }
        System.out.printf("The largest count %d and the occurrence of the count is %d", max, count);
    }
}
