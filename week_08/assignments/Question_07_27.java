import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        SelectionSort.selectionSort(list1);

        System.out.print("Enter list1: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        SelectionSort.selectionSort(list2);

        System.out.println("Two lists are " + (Question_07_26.equals(list1, list2) ? "" : "not ") + "identical");
    }
}
