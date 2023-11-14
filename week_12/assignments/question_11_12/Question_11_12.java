package question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        double value;

        do {
            value = input.nextDouble();
            if (value != 0)
                list.add(value);
        } while (value != 0);

        System.out.print("Sum of list: " + sum(list));

    }

    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
