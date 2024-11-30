
public class SavingsAccount extends BankAccount
{
    private double interestRate;

    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate)
    {
        super(accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount)
    {
        System.out.println("Depositing to Savings Account...");
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
        System.out.println("Withdrawing from Savings Account...");
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. New Balance: $" + balance);
        }

        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    public void addInterest()
    {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " applied. New Balance: $" + balance);
    }
}