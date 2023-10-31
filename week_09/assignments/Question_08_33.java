package week_09.assignments;

import java.util.Arrays;

import static week_09.assignments.Question_08_31.getIntersectingPoint;

public class Question_08_33 {
    public static void main(String[] args) {
        double[][] points = {
                {-2.5,2},
                {4,4},
                {3,-2},
                {-2,-3.5}
        };

        System.out.print("The areas are ");
        getPolygonSubarea(points);
    }

    public static double getPolygonSubarea(double[][] points){
        double[][] arranged ={
                points[0],
                points[2],
                points[1],
                points[3],
        };

        double area = 0;
        if (getIntersectingPoint(arranged) == null) area = -1;
        double[][] subTriangle = {
                {0, 0},
                {0, 0},
                {getIntersectingPoint(arranged)[0], getIntersectingPoint(arranged)[1]}
        };

        for (int i = 0; i < 4; i++) {

            if(i == 3) {
                subTriangle[0][0] = points[i][0];
                subTriangle[0][1] = points[i][1];
                subTriangle[1][0] = points[0][0];
                subTriangle[1][1] = points[0][1];
            } else {
                subTriangle[0][0] = points[i][0];
                subTriangle[0][1] = points[i][1];
                subTriangle[1][0] = points[i + 1][0];
                subTriangle[1][1] = points[i + 1][1];
            }
            System.out.printf("%.2f ", Question_08_32.getTriangleArea(subTriangle));

        }

        return area;
    }
}
