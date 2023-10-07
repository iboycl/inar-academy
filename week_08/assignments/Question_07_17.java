import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");

        int number = input.nextInt();
        input.nextLine();

        String[] names = new String[number];
        int[] scores = new int[number];
        
        System.out.println("Enter each student's name and score:");

        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d:", i + 1);
            System.out.print("\n\tName:");
            names[i] = input.nextLine();

            System.out.print("\tScore:");
            scores[i] = input.nextInt();
            input.nextLine();
        }

        for (int i = 0; i < scores.length; i++) {
            int currentMax = scores[i];
            int currentMaxIndex = i;

            String nameMax = names[i];
            int nameMaxIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (currentMax < scores[j]) {
                    currentMax = scores[j];
                    currentMaxIndex = j;

                    nameMax = names[j];
                    nameMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;

                names[nameMaxIndex] = names[i];
                names[i] = nameMax;
            }
        }


        for (String name : names) {
            System.out.println(name);
        }
        
    }
}
