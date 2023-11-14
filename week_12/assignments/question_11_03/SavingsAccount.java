package question_11_03;

import week_10.assignments.Account;

public class SavingsAccount extends Account {
    SavingsAccount(){

    }

    SavingsAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void withdraw(double amount){
        double balance = super.getBalance();
        if (balance - amount > 0){
            super.setBalance(balance - amount);
        } else System.out.println("You don't have enough balance!");
    }
}
