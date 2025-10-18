// File: BankingApp.java

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("🎉 Welcome to Simple Banking App! 🎉");

        while (!exit) {
            System.out.println("\n-----------------------------------");
            System.out.println("Please choose an option:");
            System.out.println("1. Create a new Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    myBank.createAccount();
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String accNumDeposit = scanner.nextLine();
                    Account accDeposit = myBank.findAccount(accNumDeposit);
                    if (accDeposit != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        accDeposit.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String accNumWithdraw = scanner.nextLine();
                    Account accWithdraw = myBank.findAccount(accNumWithdraw);
                    if (accWithdraw != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        accWithdraw.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    String accNumBalance = scanner.nextLine();
                    Account accBalance = myBank.findAccount(accNumBalance);
                    if (accBalance != null) {
                        System.out.println("Your current balance is: $" + accBalance.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using our banking app. Goodbye! 👋");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}