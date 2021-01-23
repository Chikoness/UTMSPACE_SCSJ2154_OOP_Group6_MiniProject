public enum EventType {
    BIRTHDAY(0), WEDDING(1), ANNIVERSARY(2), PARTY(3), EVENT(4);

    private final int eventType;

    EventType(int e) {
        eventType = e;
    }
}