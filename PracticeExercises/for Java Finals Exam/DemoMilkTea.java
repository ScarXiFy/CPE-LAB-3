import java.util.ArrayList;
import java.util.Scanner;

public class DemoMilkTea
{
    public static void main(String[] args)
    {
        // Initialize ArrayLists for available options
        ArrayList<String> flavors = new ArrayList<>();
        ArrayList<String> sizes = new ArrayList<>();
        ArrayList<String> toppings = new ArrayList<>();

        // Add available options for flavors
        flavors.add("Classic");
        flavors.add("Taro");
        flavors.add("Matcha");
        flavors.add("Strawberry");

        // Add available options for sizes
        sizes.add("12oz");
        sizes.add("16oz");
        sizes.add("22oz");

        // Add available options for toppings
        toppings.add("Pearls");
        toppings.add("Jelly");
        toppings.add("Coconut");
        toppings.add("None");

        // keyboard for user input
        Scanner keyboard = new Scanner(System.in);

        // Asks user if they want Classic or Premium MilkTea
        System.out.println("\n\t Type of MilkTea? \t\n");
        System.out.println("[ 1 ] Classic MilkTea");
        System.out.println("[ 2 ] Premium MilkTea");
        int typeChoice = keyboard.nextInt();
        keyboard.nextLine();

        // Process for Regular MilkTea
        if (typeChoice == 1)
        {
            System.out.println("\n\t Choose a flavor from the following options: ");
            for (int i = 0; i < flavors.size(); i++)
            {
                System.out.println((i + 1) + ". " + flavors.get(i));
            }
            int flavorChoice = keyboard.nextInt();
            keyboard.nextLine();
            String selectedFlavor = flavors.get(flavorChoice - 1);

            System.out.println("\n\t Choose a size from the following options: ");
            for (int i = 0; i < sizes.size(); i++)
            {
                System.out.println((i + 1) + ". " + sizes.get(i));
            }
            int sizeChoice = keyboard.nextInt();
            keyboard.nextLine();
            String selectedSize = sizes.get(sizeChoice - 1);

            MilkTea regular = new MilkTea();
            regular.setFlavor(selectedFlavor);
            regular.setSize(selectedSize);

            // Displays the Order Details
            System.out.println();
            System.out.println("\nRegular MilkTea:");
            System.out.println("Flavor: " + regular.getFlavor());
            System.out.println("Size: " + regular.getSize());
            System.out.println("Price: $" + regular.getPrice());
            System.out.println();
        }

        // Process for Premium MilkTea
        else if (typeChoice == 2) {
            System.out.println("\n\t Choose a flavor for Premium MilkTea from the following options: ");
            for (int i = 0; i < flavors.size(); i++)
            {
                System.out.println((i + 1) + ". " + flavors.get(i));
            }
            int flavorChoice = keyboard.nextInt();
            keyboard.nextLine();
            String selectedFlavor = flavors.get(flavorChoice - 1);

            System.out.println("\n\t Choose a size for Premium MilkTea from the following options: ");
            for (int i = 0; i < sizes.size(); i++)
            {
                System.out.println((i + 1) + ". " + sizes.get(i));
            }
            int sizeChoice = keyboard.nextInt();
            keyboard.nextLine();
            String selectedSize = sizes.get(sizeChoice - 1);

            System.out.println("\n\t Choose a topping for Premium MilkTea from the following options: ");
            for (int i = 0; i < toppings.size(); i++)
            {
                System.out.println((i + 1) + ". " + toppings.get(i));
            }
            int toppingChoice = keyboard.nextInt();
            keyboard.nextLine();
            String selectedTopping = toppings.get(toppingChoice - 1);

            PremiumMilkTea premium = new PremiumMilkTea();
            premium.setFlavor(selectedFlavor);
            premium.setSize(selectedSize);
            premium.setToppings(selectedTopping);

            // Displays the Order Details
            System.out.println();
            System.out.println("\nPremium MilkTea:");
            System.out.println("Flavor: " + premium.getFlavor());
            System.out.println("Size: " + premium.getSize());
            System.out.println("Toppings: " + premium.getToppings());
            System.out.println("Price: $" + premium.getPrice());
            System.out.println();

        } else {
            System.out.println("Invalid choice. Please choose either 1 or 2.");
        }


        keyboard.close();
    }
}