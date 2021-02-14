import java.util.ArrayList;
import java.util.Date;

abstract class Event { // abstract class for child event classes (Anniversary, Birthday, Party, Wedding) to inherit from
    String location;
    Date dateOfEvent;
    ArrayList<Attendee> attendees = new ArrayList<>();
    ArrayList<Food> food = new ArrayList<>();

    public Event(String _location, Date _dateOfEvent) {
        location = _location;
        dateOfEvent = _dateOfEvent;
    }

    public void setAttendees(Attendee _attendee) {
        attendees.add(_attendee);
    }

    public void setFood(Food _food) {
        food.add(_food);
    }

    public int getNumberOfAttendees() {
        return attendees.size();
    }

    abstract public String eventName(); // abstract method for child classes to print their name of their event, Eg. Charlene's Birthday (Birthday class)

    abstract public String DisplayInvitation(); // abstract method for child classes to print invitation cards in the form of Strings
}
