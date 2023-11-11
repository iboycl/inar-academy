import java.util.Scanner;

public class Question_03_32 {
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
        //double condition = (Math.abs(x1) - Math.abs(x0)) * (Math.abs(y2) - Math.abs(y0)) - (Math.abs(x2) - Math.abs(x0)) * (Math.abs(y1) - Math.abs(y0));

        String direction = "";

        if(condition > 1.7763568394002505E-15) {
            direction = "on the left side of" ;
        } else if (condition < - 1.7763568394002505E-15) {
            direction = "the right side of" ;
        } else {
            direction = "on";
        }

        System.out.printf("(%.1f, %.1f) is %s the line from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, direction, x0, y0, x1, y1);
    }
} // 2 5.5 4 -3 2.823529411764706 2.0 - 3 6 5 1 4.6 2.0 -
