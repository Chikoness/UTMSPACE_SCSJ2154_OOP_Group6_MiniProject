public abstract class Event {

    public abstract void setAttendees(int a);
    public abstract int getAttendees();
    public abstract void setTableAmt(int t);
    public abstract int getTableAmt();
    public abstract void setFoodAmt(int f);
    public abstract int getFoodAmt();
    public abstract void setType(EventType e);
    public abstract EventType getType();
    public abstract void display();
}
