public class Birthday extends Event {
    private int attendees; // number of attendees at event
    private int tableAmt; // number of tables to be used at event
    private int foodAmt; // number of types of food to be used at event
    private EventType eType;

    public Birthday(int a, int t, int f, EventType e) {
        attendees = a;
        tableAmt = t;
        foodAmt = f;
    }

    public void setAttendees(int a) {
        attendees = a;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setTableAmt(int t) {
        tableAmt = t;
    }
    public int getTableAmt() {
        return tableAmt;
    }

    public void setFoodAmt(int f) {
        foodAmt = f;
    }

    public int getFoodAmt() {
        return foodAmt;
    }

    public void setType(EventType e) {
        eType = e;
    }

    public EventType getType() {
        return eType;
    }

    public void display() {
//        System.out.print("Your event type: " + eType.name() + "\n");
        System.out.println("Your number of attendees is " + getAttendees() + " number of people.");
    }
}
