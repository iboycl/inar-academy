package week_10.assignments;

public class Question_09_07 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println(
                "\nAccount ID          : " + account1.getId() +
                "\nBalance             : " + account1.getBalance() +
                "\nMonthly interest    : " + account1.getMonthlyInterest() +
                "\nAccount created at  : " + account1.getDateCreated()
        );
    }
}
