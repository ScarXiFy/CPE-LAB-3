
public class MilkTea
{
    private String flavor;
    private String size;
    protected double price;

    // Getter Methods
    public String getFlavor()
    {
        return flavor;
    }

    public String getSize()
    {
        return size;
    }

    public double getPrice()
    {
        return price;
    }

    // Setter Methods
    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public void setSize(String size)
    {
        this.size = size;

        // Set Price based on size

        switch (size.toLowerCase())
        {
            case "12oz":
                price = 12 * 1;
                break;

            case "16oz":
                price = 16 * 1;
                break;
            
            case "22oz":
                price = 22 * 1;
                break;

            default:
                throw new IllegalArgumentException("Invalid size. Please choose 12oz, 16oz and 22oz only!");
        }
    }

    // Setter for price (to be used in PremiumMilkTea)
    protected void setPrice(double price)
    {
        this.price = price;
    }
}