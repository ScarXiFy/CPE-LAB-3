
public class Event
{
    public static final double PRICE_PER_GUEST = 35.0;
    public static final int LARGE_EVENT_CUTOFF = 50;

    private String eventNumber;
    private int numberOfGuests;
    private double price;

    public Event()
    {
        this("A000", 0);
    }

    public Event(String eventNumber, int numberOfGuests)
    {
        setEventNumber(eventNumber);
        setGuests(numberOfGuests);
    }

    public void setEventNumber(String eventNumber)
    {
        this.eventNumber = eventNumber;
    }

    public void setGuests(int numberOfGuests)
    {
        this.numberOfGuests = numberOfGuests;
        this.price = calculatePrice();
    }

    public String getEventNumber()
    {
        return eventNumber;
    }

    public int getNumberOfGuests()
    {
        return numberOfGuests;
    }

    public double getPrice()
    {
        return price;
    }

    private double calculatePrice()
    {
        return numberOfGuests * PRICE_PER_GUEST;
    }

    public boolean isLargeEvent()
    {
        return numberOfGuests >= LARGE_EVENT_CUTOFF;
    }
}
