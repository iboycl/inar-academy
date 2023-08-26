import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF:");

        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour:");

        double wind = input.nextDouble();

        if (temperature < -58 || temperature > 41){
            System.out.println("The temperature is invalid.");
        } else if (wind < 2) {
            System.out.println("The wind is invalid.");
        } else {
            double widndChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temperature * Math.pow(wind, 0.16);

            System.out.println("The wind chill index is " + String.format("%.5f",widndChill));
        }


    }
}
