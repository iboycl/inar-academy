import java.lang.reflect.Array;
import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        int pivotIndex = partition(list1);

        int pivot = list1[pivotIndex];
        list1[pivotIndex] = list1[list1.length / 2];
        list1[list1.length / 2] = pivot;

        for (int i = 0; i < list1.length / 2; i++) {
            if (list1[i] > pivot){
                int temp = list1[i];
                for (int j = (list1.length / 2 )+ 1; j < list1.length; j++) {
                    if (list1[j] <= pivot){
                        list1[i] = list1[j];
                        list1[j] = temp;
                        break;
                    }
                }
            }
        }

        System.out.print("After the partition, the list is ");
        for (int e: list1) System.out.print(e + " ");


    }

    public static int partition(int[] list){
        int[] list2 = new int[list.length];
        System.arraycopy(list, 0, list2, 0, list2.length);

        SelectionSort.selectionSort(list2);

        int pivot = list2 [list2.length / 2];
        int pivotIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == pivot) pivotIndex = i;
        }
        return pivotIndex;

    }
}
