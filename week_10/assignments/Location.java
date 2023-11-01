package week_10.assignments;

public class Location {
    int row = 0;
    int col = 0;
    double maxValue = 0;

    Location (double[][] a){
        maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] > maxValue){
                    maxValue = a[i][j];
                    row = i;
                    col = j;
                }
            }

        }
    }
}
