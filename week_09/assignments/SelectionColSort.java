package week_09.assignments;

public class SelectionColSort {

    public static void selectionColSort(double[][] list) {
        for (int k = 0; k < list[0].length; k++) {
            for (int i = 0; i < list.length - 1; i++) {
                // Find the minimum in the list[i..list.length-1]
                double currentMin = list[i][k];
                int currentMinIndex = i;

                for (int j = i + 1; j < list.length; j++) {
                    if (currentMin > list[j][k]) {
                        currentMin = list[j][k];
                        currentMinIndex = j;
                    }
                }

                // Swap list[i] with list[currentMinIndex] if necessary
                if (currentMinIndex != i) {
                    list[currentMinIndex][k] = list[i][k];
                    list[i][k] = currentMin;
                }
            }
        }

    }

}
