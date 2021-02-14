import java.text.SimpleDateFormat;
import java.util.Date;

public class Party extends Event{ // Party has partyName and organizer
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
    public String DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy"); // Date output formatting
        String stringDate = DateFor.format(dateOfEvent); // Date output formatting
        StringBuilder output = new StringBuilder(); // StringBuilder to build strings for output of invitation

        for (int i = 0; i < attendees.size(); i++) {
            output.append("======== " + partyName.toUpperCase() + " PARTY ========\n");
            output.append("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase() + "\n");
            output.append("You invited to attend " + partyName.toUpperCase() + "'s Party celebration!\n");
            output.append("\nBelow are the details of the event: \n");
            output.append("Date of event : " + stringDate + "\n");
            output.append("Location : " + location + "\n\n");

            if (food.size() > 0) { // if the user has included food, print the food list
                output.append("Food to be served at the party: \n");
                for (int j = 0; j < food.size(); j++) {
                    output.append((j+1) + ". " + food.get(j).getFoodName().toUpperCase() + "\n");
                }
            }

            output.append("\n\nShould you have any food preferences, please let us know when you respond to this invitation!\n");
            output.append("\nWe look forward to hearing your reply!\n");

            output.append("\n\nSincerely, \n" + organizer + "\n");
            output.append("==========================================================\n\n\n");
        }

        return output.toString();
    }
}
