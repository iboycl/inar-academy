public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");
        double j = 120.0;
        for (double i = 40.0; i >= 31.0 ; i--) {
            double fahrenheit = celsiusToFahrenheit(i);
            System.out.printf("%-7.1f %-10.1f | ", i, fahrenheit);

            double celsius = fahrenheitToCelsius(j);
            System.out.printf("%-10.1f %-7.1f\n", j, celsius);
            j -= 10;
        }


    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
