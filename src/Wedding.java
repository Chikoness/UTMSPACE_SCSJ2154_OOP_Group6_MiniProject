import java.text.SimpleDateFormat;
import java.util.Date;

public class Wedding extends Event{
    String bridesName;
    String groomsName;

    public Wedding(String _location, Date _dateOfEvent, String _groomsName, String _bridesName) {
        super(_location, _dateOfEvent);
        bridesName = _bridesName;
        groomsName = _groomsName;
    }

    @Override
    public String eventName() {
        return groomsName + " and " + bridesName + "'s Wedding";
    }

    @Override
    public void DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);

        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("\n======== " + groomsName.toUpperCase() + " and " + bridesName.toUpperCase() + "'s WEDDING INVITATION ========");
            System.out.println("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase());
            System.out.println("You are cordially invited to attend the wedding of\n" + groomsName.toUpperCase() + " and " + bridesName.toUpperCase() + "\n");
            System.out.println("\nBelow are the details of the event: ");
            System.out.println("Date of event : " + stringDate);
            System.out.println("Location : " + location);
            System.out.println("\nShould you have any food preferences, please let us know when you respond to this invitation!");
            System.out.println("\nWe look forward to hearing your reply!");
            System.out.println("\n\nSincerely, \n" + groomsName + " and " + bridesName);
            System.out.println("==========================================================\n");

        }
    }
}
