package week_09.assignments;

public class Question_08_21 {
    public static void main(String[] args) {
        double[][] cities = {{2.5, 5}, {5.1, 3},{1, 9}, {5.4, 54}, {5.5, 2.1}};
        double[] distances = new double[cities.length];

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                if (i == j) continue;
                distances[i] += Math.sqrt(Math.pow(cities[j][0] - cities[i][0], 2) + Math.pow(cities[j][1] - cities[i][1], 2));
            }
        }

        int minIndex = 0;
        double min = distances[0];
        for (int i = 1; i < distances.length; i++) {
            if (distances[i] < min) {
                min = distances[i];
                minIndex = i;
            }
        }

        System.out.println("The central city is at (" + cities[minIndex][0] + ", " + cities[minIndex][1] + ")");
        System.out.println("The total distance to all cities is " + min);
    }
}
