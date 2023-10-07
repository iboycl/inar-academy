public class Question_07_18 {
    public static void main(String[] args) {

        double[] numbers = getInt.getDoubleArray(10, 10);

        for (double e : numbers) System.out.print(e + " ");

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                double temp = numbers[j + 1];
                if (numbers[j] > numbers[j + 1]){
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (double e : numbers) System.out.print(e + " ");
    }
}
