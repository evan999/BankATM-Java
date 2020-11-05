package Bank;

import BankAccount.Account;
import BankAccount.BankAccount;

import java.util.HashMap;

public class Bank {
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

    

    public Account createAccount(String accountType, Client client, int accountId, int startingBalance){
        switch(accountType){
            case "checking":
                return new CheckingAccount(accountId, startingBalance, client);
            case "savings":
                int interest = ui.requestInt("Please enter interest rate:");
                return new SavingsAccount(accountId);
            default:
                return null;
        }
    };

    public void displayClients(){
        for (var client : clients.keySet()){
            System.out.println(clients.get(client));
        }
    }

    public void addClient(String firstName, String lastName){
        clientCount += 1;
        clients.put(clientCount.toString(), new Client(firstName, lastName, clientCount.toString()));
    }

    public void getClient(String clientId){

    }

    public Account getAccount(int accountId){
        return accounts.get(accountId);
    }

    // Minimum: Come up with
    public void addAccount(String clientId, String accountType, int startingBalance, UI ui){
        // TODO: get client
        // TODO: create account giving the client.
        // Which account are we creating?
        Client client = clients.get(clientId);
        Account newAccount = createAccount(accountType, client, ++accountCount, startingBalance, ui);
        client.addAccount(newAccount);

    }
}
