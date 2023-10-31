package week_09.assignments;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] points = {
                {2,2},
                {4.5,4.5},
                {6,6},
        };
        if (Double.isNaN(getTriangleArea(points))){
            System.out.println("The three points are on the same line");
        } else System.out.printf("The area of the triangle is: %.2f", getTriangleArea(points));
    }

    public static double getTriangleArea(double[][] points){
        double side1 = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1] - points[1][1], 2));
        double side2 = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));
        double side3 = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2));

        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
