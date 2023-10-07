public class Question_07_02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int e: numbers) {
            System.out.print(e + " ");
        }

        System.out.println();

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = 0;
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        for (int e: numbers) {
            System.out.print(e + " ");
        }
    }
}
