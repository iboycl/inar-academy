package week_09.assignments;

public class Question_08_35 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,0,1},
                {1,0,1,0,1},
                {1,0,0,1,0},
                {1,0,1,1,1},
                {1,1,0,1,1}
        };

        System.out.printf("The maximum sub-matrix is at (%d, %d) with size %d", findLargestBlock(matrix)[0], findLargestBlock(matrix)[1], findLargestBlock(matrix)[2]);
    }

    private static int[] findLargestBlock(int[][] matrix) {
        int[] location = {0,0,0}; // The first two are location and the third one is the size

        // move in the matrix one by one until it finds a 1
        for (int i = 0; i < matrix.length -1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {

                // if it finds a 1 start checking around it by making the square bigger gradually
                if (matrix[i][j] == 1){
                    int count = 1; // count will increase with the size of square box

                    // make the square bigger until it reached to the end of matrix
                    for (int k = 1; k + j < matrix.length && k + i < matrix.length; k++) {

                        if (matrix[i][j + k] == 1) {  //check if the first item of the bigger square is 1

                            boolean check = true; //this will stay true if all items are 1 in the square box

                            for (int l = 1; l <= k; l++) { //move in the new square
                                for (int m = 0; m <= k; m++) {
                                    if (matrix[i + l][j + m] != 1) {
                                        check = false;
                                        break;
                                    }
                                }
                            }
                            if (check){
                                count++;
                                if (count > location[2]){
                                    location[0] = i;
                                    location[1] = j;
                                    location[2] = count;
                                }
                            } else break;
                        } else break;
                    }
                }
            }
        }


        return location;

    }
}
