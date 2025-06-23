import java.util.*;

// Class representing a Bank Account
class BankAccount 
{
    String accountHolder;       // Name of the account holder
    String accountNumber;       // Account number
    double balance;             // Current balance

    // Method to take account details input
    void createAccount(Scanner sc) 
    {
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    // Method to deposit money
    void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money if balance is sufficient
    void withdraw(double amount) 
    {
        if (amount <= balance) 
	{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
	else 
	{
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display current balance
    void displayBalance() 
    {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to simulate ATM operations
public class ATM 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        account.createAccount(sc);

        while (true) 
	{
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) 
	    {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } 
	    else if (choice == 2) 
	    {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            } 
	    else if (choice == 3) 
	    {
                account.displayBalance();
            } 
	    else if (choice == 4) 
	    {
                System.out.println("Thank you for using the ATM.");
                break;
            } 
	    else 
	    {
                System.out.println("Invalid option.");
            }
        }
    }
}
