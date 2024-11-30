
public class BankAccountTest
{
    public static void main(String[] args)
    {
        // Create a Savings Account Instance
        SavingsAccount savings = new SavingsAccount("Enrico", 1000.00, 0.02);   // 2% = 0.02
        savings.displayAccountDetails();

        savings.deposit(800);
        savings.withdraw(200);
        savings.withdraw(500);

        System.out.println("Adding Interest...");
        savings.addInterest();

        savings.displayAccountDetails();

        System.out.println();

        // Create a Current Account Instance
        CurrentAccount current = new CurrentAccount("Lauron", 500.00, 500.00);
        current.displayAccountDetails();

        current.deposit(300);
        current.withdraw(600);
        current.withdraw(800);

        System.out.println();
    }
}