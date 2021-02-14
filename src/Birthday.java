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
        return birthdayName + "'s Birthday";
    }

    @Override
    public String DisplayInvitation() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(dateOfEvent);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < attendees.size(); i++) {
            output.append("======== " + birthdayName.toUpperCase() + "'s BIRTHDAY PARTY INVITATION ========\n");
            output.append("To Mr./Mrs./Ms : " + attendees.get(i).getName().toUpperCase() + "\n");
            output.append("You invited to attend " + birthdayName.toUpperCase() + "'s Birthday party celebration!" + "\n");
            output.append("\nBelow are the details of the event: \n");
            output.append("Date of event : " + stringDate + "\n");
            output.append("Location : " + location + "\n\n");

            if (food.size() > 0) {
                output.append("Food to be served at the party: \n");
                for (int j = 0; j < food.size(); j++) {
                    output.append((j+1) + ". " + food.get(j).getFoodName().toUpperCase() + "\n");
                }
            }

            output.append("\n\nShould you have any food preferences, please let us know when you respond to this invitation!\n");
            output.append("\nWe look forward to hearing your reply!\n");

            output.append("\n\nSincerely, \n" + birthdayName + "\n");
            output.append("==========================================================\n");
        }

        return output.toString();
    }
}
