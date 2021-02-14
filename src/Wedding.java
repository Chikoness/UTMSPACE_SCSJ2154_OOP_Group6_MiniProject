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
    public String DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < attendees.size(); i++) {
            output.append("======== " + groomsName.toUpperCase() + " and " + bridesName.toUpperCase() + "'s WEDDING INVITATION ========\n");
            output.append("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase() + "\n");
            output.append("You are cordially invited to attend the wedding of\n\n" + groomsName.toUpperCase() + " and " + bridesName.toUpperCase() + "\n");
            output.append("\nBelow are the details of the event: \n");
            output.append("Date of event : " + stringDate + "\n");
            output.append("Location : " + location + "\n\n");

            if (food.size() > 0) {
                output.append("Food to be served at the wedding: \n");
                for (int j = 0; j < food.size(); j++) {
                    output.append((j+1) + ". " + food.get(j).getFoodName().toUpperCase() + "\n");
                }
            }

            output.append("\n\nShould you have any food preferences, please let us know when you respond to this invitation!\n");
            output.append("\nWe look forward to hearing your reply!\n");

            output.append("\n\nSincerely, \n" + groomsName + " and " + bridesName + "\n");
            output.append("==========================================================\n");
        }

        return output.toString();
    }
}
