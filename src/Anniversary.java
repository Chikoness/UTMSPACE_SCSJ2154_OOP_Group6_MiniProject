import java.text.SimpleDateFormat;
import java.util.Date;

public class Anniversary extends Event{
    String anniversaryName;
    String organizer;

    public Anniversary(String _location, Date _dateOfEvent, String _anniversaryName, String _organizer) {
        super(_location, _dateOfEvent);
        anniversaryName = _anniversaryName;
        organizer = _organizer;
    }

    @Override
    public String eventName() {
        return anniversaryName + " Anniversary";
    }

    @Override
    public void DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);

        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("\n======== " + anniversaryName.toUpperCase() + " ANNIVERSARY INVITATION ========");
            System.out.println("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase());
            System.out.println("You invited to attend " + anniversaryName.toUpperCase() + "'s Anniversary celebration!");
            System.out.println("\nBelow are the details of the event: ");
            System.out.println("Date of event : " + stringDate);
            System.out.println("Location : " + location);
            System.out.println("\nShould you have any food preferences, please let us know when you respond to this invitation!");
            System.out.println("\nWe look forward to hearing your reply!");
            System.out.println("\n\nSincerely, \n" + organizer);
            System.out.println("==========================================================\n");
        }
    }
}
