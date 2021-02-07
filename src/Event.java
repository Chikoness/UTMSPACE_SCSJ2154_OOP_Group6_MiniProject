import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {
    String location;
    String nameOfEvent;
    Date dateOfEvent;
    ArrayList<Attendee> attendees = new ArrayList<>();

    public Event(String _nameOfEvent, String _location, Date _dateOfEvent) {
        nameOfEvent = _nameOfEvent;
        location = _location;
        dateOfEvent = _dateOfEvent;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setAttendees(Attendee at) {
        attendees.add(at);
    }

    public int getNumberOfAttendees() {
        return attendees.size();
    }

    public void DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);

        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("\n======== EVENT ========");
            System.out.println("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase());
            System.out.println("You are hereby cordially invited to attend " + nameOfEvent.toUpperCase());
            System.out.println("\nDate of event : " + stringDate);
            System.out.println("Location : " + location);
            System.out.println("=======================\n");

        }
    }
}
