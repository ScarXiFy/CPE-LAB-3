
public class EventTest
{
    public static void main(String[] args)
    {
        Event event1 = new Event();
        System.out.println("Default Constructor:");
        System.out.println("Event Number: " + event1.getEventNumber());
        System.out.println("Number of Guests: " + event1.getNumberOfGuests());
        System.out.println("Total Price: $" + event1.getPrice());
        System.out.println("Is it a large event? " + (event1.isLargeEvent() ? "Yes" : "No"));

        Event event2 = new Event("B123", 60);
        System.out.println("\nParameterized Constructor:");
        System.out.println("Event Number: " + event2.getEventNumber());
        System.out.println("Number of Guests: " + event2.getNumberOfGuests());
        System.out.println("Total Price: $" + event2.getPrice());
        System.out.println("Is it a large event? " + (event2.isLargeEvent() ? "Yes" : "No"));

        Event event3 = new Event();
        event3.setEventNumber("C456");
        event3.setGuests(30);
        System.out.println("\nUsing Setter Methods:");
        System.out.println("Event Number: " + event3.getEventNumber());
        System.out.println("Number of Guests: " + event3.getNumberOfGuests());
        System.out.println("Total Price: $" + event3.getPrice());
        System.out.println("Is it a large event? " + (event3.isLargeEvent() ? "Yes" : "No"));
    }
}
