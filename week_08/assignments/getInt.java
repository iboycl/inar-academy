import java.text.DecimalFormat;

public class getInt {
    public static int[] getIntArray(int number, int limit) {
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = 1 + (int) (Math.random() * limit);
        }
        return numbers;
    }

    public static double[] getDoubleArray(int number, int limit) {
        double[] numbers = new double[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = (double) Math.round((1 + Math.random() * limit) * 10) / 10 ;
        }
        return numbers;
    }
}
