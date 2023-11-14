package question_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    private ArrayList<Object> transactions = new ArrayList<>();
    private final Date dateCreated = new Date();

    public Account(){}

    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        if (balance - amount > 0){
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, balance, "Withdraw from ATM"));
        } else System.out.println("You don't have enough balance!");
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance, "Deposit to Bank"));
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "ID : " + id + "\n" +
                "Balance : $" + balance + "\n" +
                "DateCreated : " + dateCreated + "\n" +
                transactions;
    }
}
