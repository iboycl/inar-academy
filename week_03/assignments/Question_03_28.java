import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");

        double r1x = input.nextDouble();
        double r1y = input.nextDouble();

        double r1width = input.nextDouble();
        double r1height = input.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");

        double r2x = input.nextDouble();
        double r2y = input.nextDouble();

        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        double r1Right = r1x + r1width / 2;
        double r1Left = r1x - r1width / 2;
        double r1Top = r1y + r1height / 2;
        double r1Bottom = r1y - r1height / 2;

        double r2Right = r2x + r2width / 2;
        double r2Left = r2x - r2width / 2;
        double r2Top = r2y + r2height / 2;
        double r2Bottom = r2y - r2height / 2;

        if (r1Left <= r2Left && r1Right >= r2Right && r1Top >= r2Top && r1Bottom <= r2Bottom){
            System.out.println("r2 is inside r1");
        } else if (
                r1Left > r2Left && r1Top < r2Top && r1Right >= r2Right && r1Bottom <= r2Bottom && r2Right > r1Left && r2Bottom < r1Top ||
                r1Left > r2Left && r1Top >= r2Top && r1Right >= r2Right && r1Bottom > r2Bottom && r2Right > r1Left && r2Top < r1Bottom ||
                r1Left <= r2Left && r1Top < r2Top && r1Right < r2Right && r1Bottom <= r2Bottom && r2Left < r1Right && r2Bottom < r1Top ||
                r1Left <= r2Left && r1Top >= r2Top && r1Right < r2Right && r1Bottom > r2Bottom && r2Left < r1Right && r2Top < r1Bottom
                ) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }


    }
}
