package main.test;

import main.java.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void TC_01_TestDepositIntoAccount() {
        BankAccount account = new BankAccount();
        double input = 5000;
        account.deposit(input);
        assertEquals(input, account.getBalance(),
        "\n           --> Testing Bank Account" +
                "\n Rule        : After depositing an amount larger than zero, it must be visible in Balance" +
                "\n Test Data   : Deposit amount = " + input + "\n");
    }

    @Test
    public void TC_02_TestWithdrawFromAccountWithSufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        double input = 2000;
        account.withdraw(input);
        assertEquals(3000, account.getBalance(),
                        "\n           --> Testing Bank Account" +
                        "\n Rule        : After withdrawing a sufficient amount, it must be subtracted from the Balance" +
                        "\n Test Data   : Balance before withdrawing = 5000" +
                        "\n Test Data   : Withdraw amount = " + input +
                        "\n Test Data   : Balance after withdrawing = " + account.getBalance() + "\n");
    }

    @Test
    public void TC_03_TestWithdrawFromAccountWithExceedingBalance() {
        BankAccount account = new BankAccount();
        account.deposit(3000);
        double input = 3001;

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(input),
                "\n           --> Testing Bank Account" +
                        "\n Rule        : After withdrawing an exceeding amount, transaction must not be proceeded" +
                        "\n Test Data   : Balance before withdrawing = 3000" +
                        "\n Test Data   : Withdraw amount = " + input +
                        "\n Test Data   : Balance after withdrawing = " + account.getBalance() + "\n");
    }

    @Test
    public void TC_04_TestDepositIntoAccountWithNegativeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(3000);
        double input = -1;

        assertThrows(IllegalArgumentException.class, () -> account.deposit(input),
                "\n           --> Testing Bank Account" +
                        "\n Rule        : After depositing a negative amount, transaction must not be proceeded" +
                        "\n Test Data   : Balance before depositing = 3000" +
                        "\n Test Data   : Deposit amount = " + input +
                        "\n Test Data   : Balance after depositing = " + account.getBalance() + "\n");
    }

    @Test
    public void TC_05_TestWithdrawFromAccountWithNegativeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(3000);
        double input = -1;

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(input),
                "\n           --> Testing Bank Account" +
                        "\n Rule        : After withdrawing a negative amount, transaction must not be proceeded" +
                        "\n Test Data   : Balance before withdrawing = 3000" +
                        "\n Test Data   : Withdraw amount = " + input +
                        "\n Test Data   : Balance after withdrawing = " + account.getBalance() + "\n");
    }
}
