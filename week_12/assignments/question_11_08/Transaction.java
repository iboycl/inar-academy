package question_11_08;

import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private double amount, balance;
    private String description;

    Transaction(){

    }

    Transaction(String type, double amount, double balance, String description){
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return  "\nDate: " + date + "\n" +
                "Transaction type: " + type + "\n" +
                "Amount: " + amount + "\n" +
                "Balance: " + balance + "\n" +
                "Description: " + description + "\n";
    }
}
