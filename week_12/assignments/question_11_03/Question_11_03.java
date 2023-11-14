package question_11_03;

public class Question_11_03 {
    public static void main(String[] args) {
        SavingsAccount sav = new SavingsAccount(16, 4820);
        CheckingAccount check = new CheckingAccount(11, 1450);

        System.out.println(
                check + "\n" +
                "-----------------" + "\n" +
                sav
        );
    }
}
