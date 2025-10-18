# java-banking-app

# Simple Java Banking Application

A console-based banking application written in Java. This project simulates basic banking operations like creating accounts, depositing money, withdrawing money, and checking balances through a simple command-line interface.

This application is designed as an intermediate-level project to demonstrate core Java concepts, particularly Object-Oriented Programming (OOP).

## ✨ Features

- **Create Account**: Generate a new bank account with a unique, randomly generated 6-digit account number.
- **Deposit**: Add funds to a specific account.
- **Withdraw**: Withdraw funds from an account, with a check to prevent overdrawing.
- **Check Balance**: View the current balance of any account.
- **Interactive Menu**: A user-friendly menu to navigate through the available options.

## 🛠️ Technology Stack

- **Language:** **Java**

## 🚀 How to Get Started

### Prerequisites

- Java Development Kit (JDK) 11 or later installed on your machine.

### Running the Application

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/your-username/java-banking-app.git](https://github.com/your-username/java-banking-app.git)
    ```
    (Replace `your-username` with your actual GitHub username)

2.  **Navigate to the project directory:**
    ```sh
    cd java-banking-app
    ```

3.  **Compile the Java files:**
    ```sh
    javac BankingApp.java
    ```
    This command will compile all the necessary `.java` files (`BankingApp.java`, `Bank.java`, and `Account.java`) into `.class` files.

4.  **Run the application:**
    ```sh
    java BankingApp
    ```

5.  You will now see the application menu in your terminal. Follow the on-screen prompts to use the application.

## 📂 Project Structure

- `Account.java`: The class that defines the blueprint for a single bank account. It holds the account number and balance and contains methods for depositing and withdrawing funds.
- `Bank.java`: The class that manages all the `Account` objects. It handles account creation and searching.
- `BankingApp.java`: The main class that contains the `main` method. It drives the user interface and handles user input.
