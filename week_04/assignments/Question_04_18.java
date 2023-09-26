import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters:");

        String characters = input.next();

        String major = "";
        String year = "";

        if (characters.contains("M")){
            major = "Mathematics";
        } else if (characters.contains("C")) {
            major = "Computer Science";
        } else if (characters.contains("I")) {
            major = "Information Technology";
        } else {
            System.out.println("Indicate your major with its capital letter (M, C, I)");
        }

        if (characters.contains("1")){
            year = "Freshman";
        } else if (characters.contains("2")) {
            year = "Sophomore";
        } else if (characters.contains("3")) {
            year = "Junior";
        } else if (characters.contains("4")) {
            year = "Senior";
        } else {
            System.out.println("Indicate your year (1, 2, 3, 4)");
        }

        System.out.println(major + " " + year);
        // Freshman, Sophomore, Junior, Senior
        //M: Mathematics
        //C: Computer Science
        //I: Information Technology
    }
}
