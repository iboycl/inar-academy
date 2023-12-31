import java.util.Scanner;

public class Question_03_34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2:");

        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        String direction;

        if(!(condition > 0 || condition < 0 || x2 < x0 || y2 < y0 || x2 > x1 || y2 > y1)) {
            direction = "on" ;
        } else {
            direction = "not on";
        }

        System.out.printf("(%.1f, %.1f) is %s the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, direction, x0, y0, x1, y1);
    }
} //2 5.5 4 -3 2.823529411764706 2
