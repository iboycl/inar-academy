import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month as integer:");

        int month = input.nextInt();

        System.out.println("Enter the year as integer:");

        int year = input.nextInt();

        String verb = year > 2023 ? " will have " : " had ";

        int february = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;

        switch (month){
            case 1:
                System.out.println("January " + year + verb + "31 days");
                break;
            case 2:
                System.out.println("February " + year + verb + february + " days");
                break;
            case 3:
                System.out.println("March " + year + verb + "31 days");
                break;
            case 4:
                System.out.println("April " + year + verb + "30 days");
                break;
            case 5:
                System.out.println("May " + year + verb + "31 days");
                break;
            case 6:
                System.out.println("June " + year + verb + "30 days");
                break;
            case 7:
                System.out.println("July " + year + verb + "31 days");
                break;
            case 8:
                System.out.println("August " + year + verb + "31 days");
                break;
            case 9:
                System.out.println("September " + year + verb + "30 days");
                break;
            case 10:
                System.out.println("October " + year + verb + "31 days");
                break;
            case 11:
                System.out.println("November " + year + verb + "30 days");
                break;
            case 12:
                System.out.println("December " + year + verb + "31 days");
                break;

        }
    }
}
