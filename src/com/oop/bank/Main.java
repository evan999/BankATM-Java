package com.oop.bank;

import Bank.Client;
import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account myChecking = new CheckingAccount(1234, 100000, "cliff");
        Client cliff = new Client("Cliff", "Choiniere", "crc268");
        cliff.addAccount(myChecking);
        Account mySavings = new SavingsAccount(9876, 20000, "cliff", 3);
        cliff.addAccount(mySavings);
        cliff.addDebitCard(1234);
        cliff.addDebitCard(9876);
        System.out.println(cliff.toString());
    }
}
