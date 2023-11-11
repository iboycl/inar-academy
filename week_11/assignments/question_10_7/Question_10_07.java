package week_11.assignments.question_10_7;

import week_10.assignments.Account;

import java.util.Arrays;
import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {

        Account[] accounts = new Account[10];

        for (int i = 0; i < 10; i++) {
            Account account = new Account();
            accounts[i] = account;
            accounts[i].setId(i);
            accounts[i].setBalance(100);
        }
        atmMenu(accounts);
    }

    public static void atmMenu(Account[] accounts){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an id: ");
        int id = input.nextInt();

        while (id < 0 || id > 9){

            System.out.print("Enter a correct id: ");
            id = input.nextInt();
        }

        while (id >= 0){

            System.out.print( "\n" +
                    "Main menu\n" +
                            "1: check balance\n" +
                            "2: withdraw\n" +
                            "3: deposit\n" +
                            "4: exit\n" +
                            "Enter a choice: "
            );
            int menu = input.nextInt();
            switch (menu) {
                case 1 -> System.out.println("The balance is " + accounts[id].getBalance());
                case 2 -> {
                    System.out.print("Enter an amount to withdraw: ");
                    accounts[id].withdraw(input.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter an amount to deposit: ");
                    accounts[id].deposit(input.nextDouble());
                }
                case 4 -> {
                    System.out.println();
                    atmMenu(accounts);
                }
            }
        }

    }
}
