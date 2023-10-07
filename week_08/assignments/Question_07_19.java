import java.util.Arrays;
import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list: ");

        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The list is " + (isSorted(numbers) ? "already" : "not")+ " sorted");
    }


    public  static boolean isSorted(int[] list){
        int[] sortedList = new int[list.length];
        for (int i = 0; i < sortedList.length; i++) {
            sortedList[i] = list[i];
        }

        for (int i = 0; i < sortedList.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = sortedList[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > sortedList[j]) {
                    currentMin = sortedList[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                sortedList[currentMinIndex] = sortedList[i];
                sortedList[i] = currentMin;
            }
        }

        return Arrays.equals(sortedList, list);
    }

}
