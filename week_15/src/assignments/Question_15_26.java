package assignments;

import java.util.LinkedList;

public class Question_15_26 {
    public static void main(String[] args) {
        System.out.println("Original linked list:");

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 99) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " - ");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println();

        System.out.println("Updated linked list:");

        for (int i = 0; i < list.size() - 1; i+= 2) {
            int gcd = 1;
            int num1 = list.get(i);
            int num2 = list.get(i + 1);
            for (int j = 2; j <= (Math.min(num1, num2)); j++) {
                if (num1 % j == 0 && num2 % j == 0) gcd = j;
            }
            list.add(i + 1, gcd);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " - ");
            } else {
                System.out.print(list.get(i));
            }
        }
    }
}
