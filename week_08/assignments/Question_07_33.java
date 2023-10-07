import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:");

        int year = input.nextInt();

        String[] zodiac = {"monkey", "rooster", "dog" ,"pig", "rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};

        System.out.println("That year is " + zodiac[year % 12] + " year.");

    }
}
