import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");

        String city1 = input.nextLine();

        System.out.println("Enter the second city:");

        String city2 = input.nextLine();

        System.out.println("Enter the third city:");

        String city3 = input.nextLine();

        String first = "";
        String second = "";
        String third = "";

        if (city1.compareToIgnoreCase(city2) > 0 && city2.compareToIgnoreCase(city3) > 0){
             first = city3;
             second = city2;
             third = city1;
        } else if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) > 0) {
             first = city3;
             second = city1;
             third = city2;
        } else if (city1.compareToIgnoreCase(city2) < 0 && city2.compareToIgnoreCase(city3) < 0) {
            first = city1;
            second = city2;
            third = city3;
        } else if (city3.compareToIgnoreCase(city1) > 0 && city3.compareToIgnoreCase(city2) < 0) {
            first = city1;
            second = city3;
            third = city2;
        } else if (city2.compareToIgnoreCase(city1) < 0 && city1.compareToIgnoreCase(city3) < 0) {
            first = city2;
            second = city1;
            third = city3;
        } else {
            first = city2;
            second = city3;
            third = city1;
        }

        System.out.printf("The three cities in alphabetical order are %s, %s and %s", first, second, third);
    }
}
