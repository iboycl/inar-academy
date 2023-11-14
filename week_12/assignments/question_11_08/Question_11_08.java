package question_11_08;

public class Question_11_08 {
    public static void main(String[] args) {
        Account george = new Account("George", 1122, 1000);
        george.setAnnualInterestRate(1.5);
        george.deposit(30);
        george.deposit(40);
        george.deposit(50);
        george.withdraw(5);
        george.withdraw(4);
        george.withdraw(2);

        System.out.println(george);
    }
}
