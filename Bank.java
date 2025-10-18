// File: Bank.java

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public Account createAccount() {
        // Generate a random 6-digit account number as a String
        String accountNumber = String.format("%06d", new Random().nextInt(999999));
        
        Account newAccount = new Account(accountNumber, 0.0);
        accounts.add(newAccount);
        
        System.out.println("Account created successfully!");
        System.out.println("Your new account number is: " + accountNumber);
        return newAccount;
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Return null if no account is found
    }
}