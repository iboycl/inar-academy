package question_11_03;

import week_10.assignments.Account;

public class CheckingAccount extends Account {
    CheckingAccount(){

    }

    CheckingAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void withdraw(double amount){
        double balance = super.getBalance();
        if (balance - amount > -501){
            super.setBalance(balance - amount);
        } else System.out.println("You don't have enough balance!");
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "Limit : $" + (getBalance() + 500);
    }
}
