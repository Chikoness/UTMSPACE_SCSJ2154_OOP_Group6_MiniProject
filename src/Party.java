import java.text.SimpleDateFormat;
import java.util.Date;

public class Party extends Event{
    String partyName;
    String organizer;

    public Party(String _location, Date _dateOfEvent, String _partyName, String _organizer) {
        super(_location, _dateOfEvent);
        partyName = _partyName;
        organizer = _organizer;
    }

    @Override
    public String eventName() {
        return partyName + " Party";
    }

    @Override
    public void DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);

        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("\n======== " + partyName.toUpperCase() + " PARTY ========");
            System.out.println("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase());
            System.out.println("You invited to attend " + partyName.toUpperCase() + "'s Party celebration!");
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
