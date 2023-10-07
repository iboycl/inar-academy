import static java.util.Arrays.binarySearch;

public class Question_07_16 {
    public static void main(String[] args) {

        int[] numbers = new int[100000];

        for (int num : numbers) {
            num = 1 + (int) (Math.random() * 100000);
        }

        int key = 1 + (int) (Math.random() * 100000);

        long startTime = System.currentTimeMillis();
        int result = LinearSearch.linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);

        SelectionSort.selectionSort(numbers);

        startTime = System.currentTimeMillis();
        result = binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime + " ");

    }


}
