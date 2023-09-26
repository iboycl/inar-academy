import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month (Just the first three letters):");

        String month = input.next();

        System.out.println("Enter the year as integer:");

        int year = input.nextInt();

        String verb = year > 2023 ? " will have " : " had ";

        int february = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;

        switch (month){
            case "Jan":
                System.out.println("January " + year + verb + "31 days");
                break;
            case "Feb":
                System.out.println("February " + year + verb + february + " days");
                break;
            case "Mar":
                System.out.println("March " + year + verb + "31 days");
                break;
            case "Apr":
                System.out.println("April " + year + verb + "30 days");
                break;
            case "May":
                System.out.println("May " + year + verb + "31 days");
                break;
            case "Jun":
                System.out.println("June " + year + verb + "30 days");
                break;
            case "Jul":
                System.out.println("July " + year + verb + "31 days");
                break;
            case "Aug":
                System.out.println("August " + year + verb + "31 days");
                break;
            case "Sep":
                System.out.println("September " + year + verb + "30 days");
                break;
            case "Oct":
                System.out.println("October " + year + verb + "31 days");
                break;
            case "Nov":
                System.out.println("November " + year + verb + "30 days");
                break;
            case "Dec":
                System.out.println("December " + year + verb + "31 days");
                break;

        }
    }
}
