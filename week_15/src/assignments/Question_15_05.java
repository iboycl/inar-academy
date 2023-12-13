package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_15_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers for List nums (enter -1 to stop): ");

        ArrayList<Integer> list = new ArrayList<>();
        int num = input.nextInt();
        int countZero = 0;
        while (num != -1){
            if (num == 0) {
                countZero++;
            } else {
                list.add(num);
            }
            num = input.nextInt();
        }
        for (int i = 0; i < countZero; i++) {
            list.add(0);
        }
        System.out.println(list);
    }
}
