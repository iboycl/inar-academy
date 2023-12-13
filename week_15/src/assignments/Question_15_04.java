package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_15_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of list A: ");
        int listAsize = input.nextInt();

        System.out.print("Enter integers for the list A: ");
        ArrayList<Integer> listA = new ArrayList<>(listAsize);
        for (int i = 0; i < listAsize; i++) {
            listA.add(input.nextInt());
        }

        System.out.print("Enter the size of list B: ");
        int listBsize = input.nextInt();

        System.out.print("Enter integers for the list B: ");
        ArrayList<Integer> listB = new ArrayList<>(listBsize);
        for (int i = 0; i < listBsize; i++) {
            listB.add(input.nextInt());
        }

        Collections.sort(listA);
        Collections.sort(listB);

        ArrayList<Integer> listC = new ArrayList<>(listAsize + listBsize);
        listC.addAll(listA);

        for (int i = listBsize -1; i >= 0; i--) {
            listC.add(listB.get(i));
        }

        System.out.println("Merged and sorted List C:");
        System.out.println(listC);
    }
}
