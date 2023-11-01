package week_10.assignments;


public class Question_09_06 {
    public static void main(String[] args) {
        int[] list = new int[100000];
        for (int i = 0; i < 100000; i++) {
            list[i] = (int)(Math.random() * 1000);
        }
        StopWatch watch = new StopWatch();

        watch.start() ;

        SelectionSort.selectionSort(list);

        watch.stop();

        System.out.println("The execution time of sorting 100,000 numbers using selection sort: " + watch.getElapsedTime() + " milliseconds");
    }
}
