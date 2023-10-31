package week_09.assignments;

public class Question_08_31 {
    public static void main(String[] args) {
        double[][] points = {
                {2,2},
                {7,6},
                {4,2},
                {-1,-2}
        };
        if (getIntersectingPoint(points) == null){
            System.out.println("The two lines are parallel");
        } else System.out.println("The intersecting point is at (" + getIntersectingPoint(points)[0] + ", " +getIntersectingPoint(points)[1] + ")");
    }

    public static double[] getIntersectingPoint(double[][] points){
        double[] solution = {0,0};

        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        if(a * d - b * c == 0) {
            return null;
        } else {
            solution[0] = (e * d - b * f) / (a * d - b * c);
            solution[1] = (a * f - e * c) / (a * d - b * c);
        }
        return solution;
    }

}
