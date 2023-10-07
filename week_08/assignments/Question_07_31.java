import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] merged = merge(list1, list2);

        System.out.print("The merged list is ");

        for (int e : merged) System.out.print(e + " ");
    }

    private static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) merged[i] = list1[i];
        for (int i = 0; i < list2.length; i++) merged[i + list1.length] = list2[i];

        SelectionSort.selectionSort(merged);

        return merged;
    }
}
