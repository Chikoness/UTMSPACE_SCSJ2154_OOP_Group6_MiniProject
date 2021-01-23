public class RunEvent {
    public static void main(String[] args) {
        EventType ev = EventType.BIRTHDAY;
        Birthday birthday = new Birthday(120, 5, 2, ev);

        birthday.display();
    }
}
