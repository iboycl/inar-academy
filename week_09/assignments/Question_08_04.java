package week_09.assignments;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] hours = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}
        };

        int[][] workers = new int[hours.length][2];

        for (int i = 0; i < hours.length ; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                workers[i][1] += hours[i][j];
                workers[i][0] = i;
            }
        }
        decreasingSort(workers);

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Employee " + (workers[i][0] + 1) + "'s total work hour is " + workers[i][1]);
        }

    }

    public static void decreasingSort(int[][] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMaxHour = list[i][1];
            int currentMaxWorker = list[i][0];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMaxHour < list[j][1]) {
                    currentMaxHour = list[j][1];
                    currentMaxWorker = list[j][0];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex][1] = list[i][1];
                list[currentMaxIndex][0] = list[i][0];
                list[i][1] = currentMaxHour;
                list[i][0] = currentMaxWorker;
            }
        }
    }
}
