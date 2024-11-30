
public abstract class BankAccount
{
    protected String accountHolderName;
    protected double balance;
    
    // Default Constructor
    public BankAccount(String accountHolderName, double balance)
    {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Abstract Methods

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Method to display account details
    public void displayAccountDetails()
    {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}