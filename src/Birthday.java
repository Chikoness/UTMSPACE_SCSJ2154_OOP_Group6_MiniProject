import java.text.SimpleDateFormat;
import java.util.Date;

public class Birthday extends Event{
    String birthdayName;

    public Birthday(String _location, Date _dateOfEvent, String _birthdayName) {
        super(_location, _dateOfEvent);
        birthdayName = _birthdayName;
    }

    @Override
    public String eventName() {
        return birthdayName + "'s " + this.getClass().getSimpleName();
    }

    @Override
    public void DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);

        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("\n======== " + birthdayName.toUpperCase() + "'s BIRTHDAY PARTY INVITATION ========");
            System.out.println("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase());
            System.out.println("You invited to attend " + birthdayName.toUpperCase() + "'s Birthday party celebration!");
            System.out.println("\nBelow are the details of the event: ");
            System.out.println("Date of event : " + stringDate);
            System.out.println("Location : " + location);
            System.out.println("\nShould you have any food preferences, please let us know when you respond to this invitation!");
            System.out.println("\nWe look forward to hearing your reply!");
            System.out.println("\n\nSincerely, \n" + birthdayName);
            System.out.println("==========================================================\n");

        }
    }
}
