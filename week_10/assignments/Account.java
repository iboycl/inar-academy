package week_10.assignments;

import java.util.Date;
//UML Class Diagram
/************************************************************
 *               Account                                    *
 * ---------------------------------------------------------*
 * id: int                                                  *
 * balance: double                                          *
 * annualInterestRate: double                               *
 * dateCreated: Date                                        *
 * ---------------------------------------------------------*
* +Account()                                                *
 * +Account(id: int, balance: double)                       *
 * +getId() : int                                           *
 * +setId(id: int)                                          *
 * +getBalance() : double                                   *
 * +setBalance(balance: double)                             *
 * +getAnnualInterestRate() : double                        *
 * +setAnnualInterestRate(annualInterestRate: double)       *
 * +getDateCreated() : String                               *
 * +getMonthlyInterestRate() : double                       *
 * +getMonthlyInterest() :double                            *
 * +withdraw(amount: double)                                *
 * deposit(amount: double)                                  *
 ************************************************************/
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    private final Date dateCreated = new Date();

    public Account(){}

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
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
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return  "ID : " + id + "\n" +
                "Balance : $" + balance + "\n" +
                "DateCreated : " + dateCreated;
    }
}
