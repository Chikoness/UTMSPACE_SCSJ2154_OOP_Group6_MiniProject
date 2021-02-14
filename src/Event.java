import java.util.ArrayList;
import java.util.Date;

abstract class Event {
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

    abstract public String eventName();

    abstract public String DisplayInvitation();
}
