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
    public String DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < attendees.size(); i++) {
            output.append("======== " + anniversaryName.toUpperCase() + " ANNIVERSARY INVITATION ========\n");
            output.append("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase() + "\n");
            output.append("You invited to attend " + anniversaryName.toUpperCase() + "'s Anniversary celebration!\n");
            output.append("\nBelow are the details of the event: \n");
            output.append("Date of event : " + stringDate + "\n");
            output.append("Location : " + location + "\n\n");

            if (food.size() > 0) {
                output.append("Food to be served at the party: \n");
                for (int j = 0; j < food.size(); j++) {
                    output.append((j+1) + ". " + food.get(j).getFoodName().toUpperCase());
                }
            }

            output.append("\n\nShould you have any food preferences, please let us know when you respond to this invitation!\n");
            output.append("\nWe look forward to hearing your reply!\n");

            output.append("\n\nSincerely, \n" + organizer + "\n");
            output.append("==========================================================\n");
        }

        return output.toString();
    }
}
