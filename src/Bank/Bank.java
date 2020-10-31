package Bank;

import BankAccount.Account;
import BankAccount.BankAccount;

import java.util.HashMap;

public class Bank extends BankAccount {
    private String name;
    private int safeAmt;
    private HashMap<String, Client> clients;
    private HashMap<Integer, Account> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;

    public Bank(String name){
        this.name = name;
        clients = new HashMap<>();
        accounts = new HashMap<>();
    }

    // TODO: Best way to add an account

    

    public Account createAccount(){

    };

    public void getClient(String clientId){

    }

    // Minimum: Come up with
    public void addCheckingAccount(){
        // TODO: get client
        // TODO: create account giving the client.
        // Which account are we creating?
    }
}
