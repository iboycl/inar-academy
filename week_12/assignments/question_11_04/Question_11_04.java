package question_11_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        System.out.println("The largest number in the list is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list){
        if (list == null || list.isEmpty()){
            return null;
        } else return Collections.max(list);
    }

}
