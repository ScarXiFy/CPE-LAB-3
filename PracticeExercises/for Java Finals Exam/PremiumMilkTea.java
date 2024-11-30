
public class PremiumMilkTea extends MilkTea
{
    private String toppings;

    // Getter for toppings
    public String getToppings()
    {
        return toppings;
    }

    // Setter for toppings
    public void setToppings(String toppings)
    {
        this.toppings = toppings;
    }

    @Override
    public void setSize(String size)
    {
        super.setSize(size);

        // Set price at $2 per oz for PremiumMilkTea
        switch(size.toLowerCase())
        {
            case "12oz":
                super.setPrice(12 * 2);     // $2 per oz
                break;

            case "16oz":
                super.setPrice(16 * 2);     // $2 per oz
                break;

            case "22oz":
                super.setPrice(22 * 2);     // $2 per oz
                break;

            default:
                throw new IllegalArgumentException("Invalid size. Please choose 12oz, 16oz and 22oz only!");
        }
    }
}