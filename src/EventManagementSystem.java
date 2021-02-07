import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EventManagementSystem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Event> events = new ArrayList<>();

        System.out.println("__________________________________________");
        System.out.println("__________EVENT MANAGEMENT SYSTEM_________");

        int option = Integer.MAX_VALUE; // variable with random int to initialize option
        while (option != 4) {
            System.out.println("__________________________________________");
            System.out.println("\n1. Create an event");
            System.out.println("2. Add attendee to event");
            System.out.println("3. Print event's invitation cards");
            System.out.println("4. Exit");

            System.out.print("\nEnter option number to navigate: ");
            option = Integer.parseInt(input.nextLine());
            System.out.println("__________________________________________");

            switch (option) {
                case 1 -> {
                    System.out.print("Name of event: ");
                    String nameOfEvent = input.nextLine();
                    System.out.print("Enter location of event: ");
                    String location = input.nextLine();
                    System.out.print("Enter date of event (Eg, 08 July 2021): ");
                    String date = input.nextLine();
                    Date dateIntoDateFormat = new SimpleDateFormat("dd MMMM yyyy").parse(date);

                    Event event = new Event(nameOfEvent, location, dateIntoDateFormat);
                    events.add(event);
                }
                case 2 -> {
                    if (events.size() > 0) {
                        System.out.println("Which event would you like to add attendees to?");

                        for (int i = 0; i < events.size(); i++) {
                            System.out.println((i+1) + ". " + events.get(i).getNameOfEvent());
                        }
                        System.out.print("\nEnter the number of event to select : ");
                        int option2 = Integer.parseInt(input.nextLine());

                        while (option2 < 0 || option2 > events.size()) {
                            System.out.println("\nEvent doesn't exist. Try again.");
                            System.out.print("Enter the number of event to select : ");
                            option2 = Integer.parseInt(input.nextLine());
                        }

                        System.out.println("\nAdding to attendee to - " + events.get(option2-1).getNameOfEvent());
                        System.out.println("ATTENDEE #" + ((events.get(option2-1).getNumberOfAttendees()) + 1));
                        System.out.println("=========================");
                        System.out.print("Name: ");
                        String name = input.nextLine();
                        System.out.print("Age: ");
                        int age = Integer.parseInt(input.nextLine());
                        System.out.print("Email: ");
                        String email = input.nextLine();
                        System.out.println("=========================");

                        Attendee attendee = new Attendee(name, email, age);
                        events.get(option2-1).setAttendees(attendee);
                    }
                    else {
                        System.out.println("\nNo events have been created. Please create an event first.\n");
                    }
                }
                case 3 -> {
                    if (events.size() > 0) {
                        System.out.println("Which event would you to select?");

                        for (int i = 0; i < events.size(); i++) {
                            System.out.println((i+1) + ". " + events.get(i).getNameOfEvent());
                        }
                        System.out.print("\nEnter the number of event to select : ");
                        int option3 = Integer.parseInt(input.nextLine());

                        while (option3 < 0 || option3 > events.size()) {
                            System.out.println("\nEvent doesn't exist. Try again.");
                            System.out.print("Enter the number of event to select : ");
                            option3 = Integer.parseInt(input.nextLine());
                        }

                        if (events.get(option3-1).getNumberOfAttendees() <= 0) {
                            System.out.println("\nNo attendees have been added. Please add attendees to your event.");
                        }
                        else {
                            events.get(option3-1).DisplayInvitation();
                        }

                    } else {
                        System.out.println("\nNo events have been created. Please create an event first.\n");
                    }
                }
                case 4 -> System.out.println("\nThank you for using Event Management System. We hope to see you again! :)");
                default -> System.out.println("\nSorry, option not recognized. Please enter between 1 to 4.\n");
            }
        }
    }
}
