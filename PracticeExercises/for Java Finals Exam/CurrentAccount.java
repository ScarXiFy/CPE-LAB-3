
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit)
    {
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount)
    {
        System.out.println("Depositing to Current Account...");
        if(amount > 0)
        {
            balance += amount;
            System.out.println("$" + amount + " deposited. New Balance: $" + balance);
        }

        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount)
    {
        System.out.println("Withdrawing to Current Account...");
        if(amount > 0 && amount <= balance + overdraftLimit)
        {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. New Balance: $" + balance);
        }

        else
        {
            System.out.println("Insufficient Balance or Overdraft Limit exceeded! Cannot withdraw $" + amount);
        }
    }
}