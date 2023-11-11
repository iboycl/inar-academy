package week_11.assignments.question_10_8;

public class Question_10_08 {
    public static void main(String[] args) {
        System.out.println("                         2009 Taxes");
        System.out.print(
                "Taxable   Single      Married Joint      Married      Head of\n" +
                "Income                or Qualifying      Separate     a House\n" +
                "                      Widow(er)\n"
        );
        System.out.print("----------------------------------------------------------------\n");
        for (int i = 50000; i <= 60000; i+=1000) {
            System.out.printf("%-10d",i);
            for (int j = 0; j < 4; j++) {
                double temp = new Tax(i,j).getTax();
                String strTax = switch (j) {
                    case 0 -> "%8.2f   ";
                    case 1 -> "%8.2f   ";
                    case 2 -> "%16.2f   ";
                    case 3 -> "%9.2f\n";
                    default -> "";
                };
                System.out.printf(strTax, temp);
            }
        }
    }
}
