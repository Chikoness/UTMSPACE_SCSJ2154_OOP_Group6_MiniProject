import java.util.ArrayList;
import java.util.Date;

abstract class Event {
    String location;
    Date dateOfEvent;
    ArrayList<Attendee> attendees = new ArrayList<>();

    public Event(String _location, Date _dateOfEvent) {
        location = _location;
        dateOfEvent = _dateOfEvent;
    }

    public void setAttendees(Attendee at) {
        attendees.add(at);
    }

    public int getNumberOfAttendees() {
        return attendees.size();
    }

    abstract public String eventName();

    abstract public void DisplayInvitation();
}
