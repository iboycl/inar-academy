import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int day = input.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            monthDays[1] += 1;
        }

        for (int i = 0; i < 12; i++) {

            System.out.println("\n" + months[i] + " " + year);
            System.out.println("-----------------------------------");
            System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            if (day != 0) {
                for (int k = day; k > 0; k--) {
                    System.out.print("     ");
                }
            }

            for (int j = 1; j <= monthDays[i]; j++) {
                if ((day + j) % 7 == 0) {
                    System.out.printf(" %2d\n", j);
                } else {
                    System.out.printf(" %2d  ", j);
                }

                if (j == monthDays[i]){
                    System.out.println();
                }
            }

                day = (day + monthDays[i]) % 7;
        }
    }
}
