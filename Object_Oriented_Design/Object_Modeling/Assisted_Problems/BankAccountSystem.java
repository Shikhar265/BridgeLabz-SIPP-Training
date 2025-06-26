import java.util.*;

// Class representing a Bank Account
class Account 
{
    int accNo;                   // Account number
    double balance;              // Account balance

    Account(int accNo, double balance) 
    {
        this.accNo = accNo;
        this.balance = balance;
    }

    void viewBalance() 
    {
        System.out.println("Account No: " + accNo + ", Balance: ₹" + balance);
    }
}

// Class representing a Customer
class Customer 
{
    String name;                      
    ArrayList<Account> accounts;      

    Customer(String name) 
    {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account acc) 
    {
        accounts.add(acc);
    }

    void viewAllAccounts() 
    {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) 
        {
            acc.viewBalance();
        }
        System.out.println();
    }
}

// Class representing a Bank
class Bank 
{
    String bankName;                  
    ArrayList<Customer> customers;    

    Bank(String bankName) 
    {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    void openAccount(String custName, int accNo, double initialDeposit) 
    {
        Customer customer = findCustomer(custName);
        if (customer == null) 
        {
            customer = new Customer(custName);
            customers.add(customer);
        }
        customer.addAccount(new Account(accNo, initialDeposit));
        System.out.println("Account " + accNo + " opened for " + custName + " in " + bankName);
    }

    Customer findCustomer(String name) 
    {
        for (Customer cust : customers) 
        {
            if (cust.name.equalsIgnoreCase(name)) 
            {
                return cust;
            }
        }
        return null;
    }

    void showAllCustomers() 
    {
        System.out.println("\nBank: " + bankName + " - Customer Accounts");
        for (Customer cust : customers) 
        {
            cust.viewAllAccounts();
        }
    }
}

// Main class to test the Bank-Customer-Account relationship
public class BankAccountSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bank name: ");
        String bankName = sc.nextLine();
        Bank bank = new Bank(bankName);

        System.out.print("Enter number of customers: ");
        int customerCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < customerCount; i++) 
        {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of accounts for " + name + ": ");
            int accCount = sc.nextInt();

            for (int j = 0; j < accCount; j++) 
            {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();

                System.out.print("Enter initial deposit: ");
                double deposit = sc.nextDouble();
                sc.nextLine();

                bank.openAccount(name, accNo, deposit);
            }
        }

        bank.showAllCustomers();
    }
}
