import java.util.Scanner;

public class Question_06_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2:");

        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        String direction = "";

        if(leftOfTheLine(x0,y0, x1, y1, x2, y2)) {
            direction = "on the left side of" ;
        } else if (onTheSameLine(x0,y0, x1, y1, x2, y2)) {
            direction = "on" ;
        } else if (rightOfTheLine(x0,y0, x1, y1, x2, y2)){
            direction = "on the right side of";
        }

        System.out.printf("(%.1f, %.1f) is %s the line from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, direction, x0, y0, x1, y1);
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
    }

    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0;
    }
}
