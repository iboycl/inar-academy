import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name:");

        String name = input.next();

        System.out.println("Enter number of hours worked in a week:");

        double hours = input.nextDouble();

        System.out.println("Enter hourly pay rate::");

        double pay = input.nextDouble();

        System.out.println("Enter federal tax withholding rate:");

        double fedTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate::");

        double stateTax = input.nextDouble();

        double gross = hours * pay;

        double fedCut = gross * fedTax;

        double stateCut = gross * stateTax;

        double totalCut = fedCut + stateCut;

        double netPay = gross - totalCut;

        System.out.printf(
                "Employee Name: %s \n" +
                "Hours Worked: %.2f \n" +
                "Pay Rate: %.2f \n" +
                "Gross Pay: %.2f \n" +
                "Deductions: \n" +
                "   Federal Withholding (20.0%%): %.2f \n" +
                "   State Withholding (9.0%%): %.2f \n" +
                "   Total Deduction: %.2f \n" +
                "Net Pay: %.2f", name, hours, pay, gross, fedCut, stateCut, totalCut, netPay

        );



    }
}
