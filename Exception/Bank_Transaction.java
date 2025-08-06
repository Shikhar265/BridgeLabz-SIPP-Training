// Custom Checked Exception
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

// Bank Account Class
class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// Main Class
public class Bank_Transaction
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(1000.0);

        try
        {
            account.withdraw(1200);  // Test with insufficient balance
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            account.withdraw(-500);  // Test with negative amount
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            account.withdraw(500);  // Valid withdrawal
        }
        catch (InsufficientBalanceException | IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
