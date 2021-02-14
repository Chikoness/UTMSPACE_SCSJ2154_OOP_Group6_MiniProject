import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EventManagementSystem {
    public static void main(String[] args) throws ParseException { // ParseException is to catch Date input error
        Scanner input = new Scanner(System.in);
        ArrayList<Event> events = new ArrayList<>();

        System.out.println("__________________________________________");
        System.out.println("__________EVENT MANAGEMENT SYSTEM_________");

        int option = Integer.MAX_VALUE; // variable with random int to initialize option
        while (option != 5) { // menu system begins here
            System.out.println("__________________________________________");
            System.out.println("\n1. Create an event");
            System.out.println("2. Choose food for event");
            System.out.println("3. Add attendee to event");
            System.out.println("4. Print event's invitation cards");
            System.out.println("5. Exit");

            System.out.print("\nEnter option number to navigate: ");
            option = Integer.parseInt(input.nextLine());
            System.out.println("__________________________________________");

            switch (option) {
                case 1 -> { // 1. Create an event
                    System.out.println("What kind of event do you plan to host?");
                    System.out.println("1. Birthday");
                    System.out.println("2. Wedding");
                    System.out.println("3. Anniversary");
                    System.out.println("4. Party (Default event)");
                    System.out.print("Enter 1, 2, 3, or 4 : ");
                    int eventType = Integer.parseInt(input.nextLine());

                    while (eventType < 0 || eventType > 4) { // If eventType is not between 1 - 4, loop menu selection again
                        System.out.println("Event type not recognized. Try again.\n");

                        System.out.println("What kind of event do you plan to host?");
                        System.out.println("1. Birthday");
                        System.out.println("2. Wedding");
                        System.out.println("3. Anniversary");
                        System.out.println("4. Party (Default event)");
                        System.out.print("Enter 1, 2, 3, or 4 : ");
                        eventType = Integer.parseInt(input.nextLine());
                    }

                    System.out.print("\nEnter location of event: ");
                    String location = input.nextLine();
                    System.out.print("Enter date of event (Eg, 08 July 2021): ");
                    String date = input.nextLine();
                    Date dateIntoDateFormat = new SimpleDateFormat("dd MMMM yyyy").parse(date);

                    switch (eventType) {
                        case 1 -> { // Birthday selected
                            System.out.print("Name of the birthday boy/girl? ");
                            String birthdayName = input.nextLine();

                            Birthday birthday = new Birthday(location, dateIntoDateFormat, birthdayName);
                            events.add(birthday);
                        }

                        case 2 -> { // Wedding selected
                            System.out.print("Name of the groom: ");
                            String groomsName = input.nextLine();
                            System.out.print("Name of the bride: ");
                            String bridesName = input.nextLine();

                            Wedding wedding = new Wedding(location, dateIntoDateFormat, groomsName, bridesName);
                            events.add(wedding);
                        }

                        case 3 -> { // Anniversary selected
                            System.out.print("What's the anniversary? (Eg, Baby Michael's Full Moon (Anniversary), omit the \"Anniversary\"): ");
                            String anniversaryName = input.nextLine();
                            System.out.print("Name of the organizer (of the event): ");
                            String organizer = input.nextLine();

                            Anniversary anniversary = new Anniversary(location, dateIntoDateFormat, anniversaryName, organizer);
                            events.add(anniversary);
                        }

                        case 4 -> { // Party selected
                            System.out.print("What's the party about? (Eg, Sandy's High School Graduation, omit the \"Party\"): ");
                            String partyName = input.nextLine();
                            System.out.print("Name of the organizer (of the event): ");
                            String organizer = input.nextLine();

                            Party party = new Party(location, dateIntoDateFormat, partyName, organizer);
                            events.add(party);
                        }

                        default -> System.out.println("Event not recognized."); // input not between 1 - 4, go back to menu selection
                    }
                }

                case 2 -> { // 2. Choose food for event
                    if (events.size() > 0) {
                        System.out.println("Which event would you to choose food for?");

                        for (int i = 0; i < events.size(); i++) {
                            System.out.println((i+1) + ". " + events.get(i).eventName());
                        }

                        System.out.print("\nEnter the number of event to select: ");
                        int option4 = Integer.parseInt(input.nextLine());

                        while (option4 < 0 || option4 > events.size()) {
                            System.out.println("\nEvent doesn't exist. Try again.");
                            System.out.print("Enter the number of event to select: ");
                            option4 = Integer.parseInt(input.nextLine());
                        }

                        System.out.println("\nChoose the food that you would like served at the event: ");
                        System.out.println("APPETIZERS: ");
                        System.out.println("1. Honey Garlic Mini Sausages");
                        System.out.println("2. Nachos Dip");
                        System.out.print("Choose 1 or 2, 3 for both, or any other number for none: ");
                        int appetizers = Integer.parseInt(input.nextLine());

                        switch (appetizers) {
                            case 1 -> {
                                events.get(option4-1).setFood(Food.App01);
                                System.out.println(Food.App01.foodName.toUpperCase() + " added to the menu.");
                            }

                            case 2 -> {
                                events.get(option4-1).setFood(Food.App02);
                                System.out.println(Food.App02.foodName.toUpperCase() + " added to the menu.");
                            }

                            case 3 -> {
                                events.get(option4-1).setFood(Food.App01);
                                events.get(option4-1).setFood(Food.App02);
                                System.out.println(Food.App01.foodName.toUpperCase() + " added to the menu.");
                                System.out.println(Food.App02.foodName.toUpperCase() + " added to the menu.");
                            }

                            default -> System.out.println("No appetizer added to the menu.");
                        }

                        System.out.println("\nMAIN COURSES: ");
                        System.out.println("1. Macaroni and Cheese with Beef Bacon");
                        System.out.println("2. Soy Sauce Chicken Fried Rice");
                        System.out.print("Choose 1 or 2, 3 for both, or any other number for none: ");
                        int mainCourse = Integer.parseInt(input.nextLine());

                        switch (mainCourse) {
                            case 1 -> {
                                events.get(option4-1).setFood(Food.Main01);
                                System.out.println(Food.Main01.foodName.toUpperCase() + " added to the menu.");
                            }

                            case 2 -> {
                                events.get(option4-1).setFood(Food.Main02);
                                System.out.println(Food.Main02.foodName.toUpperCase() + " added to the menu.");
                            }

                            case 3 -> {
                                events.get(option4-1).setFood(Food.Main01);
                                events.get(option4-1).setFood(Food.Main02);
                                System.out.println(Food.Main01.foodName.toUpperCase() + " added to the menu.");
                                System.out.println(Food.Main02.foodName.toUpperCase() + " added to the menu.");
                            }

                            default -> System.out.println("No main course added to the menu.");
                        }

                        System.out.println("\nDESSERTS: ");
                        System.out.println("1. Caramel Pudding");
                        System.out.println("2. Fruit Cocktail");
                        System.out.print("Choose 1 or 2, 3 for both, or any other number for none: ");
                        int desserts = Integer.parseInt(input.nextLine());

                        switch (desserts) {
                            case 1 -> {
                                events.get(option4-1).setFood(Food.Des01);
                                System.out.println(Food.Des01.foodName.toUpperCase() + " added to the menu.");
                            }

                            case 2 -> {
                                events.get(option4-1).setFood(Food.Des02);
                                System.out.println(Food.Des02.foodName.toUpperCase() + " added to the menu.");
                            }

                            case 3 -> {
                                events.get(option4-1).setFood(Food.Des01);
                                events.get(option4-1).setFood(Food.Des02);
                                System.out.println(Food.Des01.foodName.toUpperCase() + " added to the menu.");
                                System.out.println(Food.Des02.foodName.toUpperCase() + " added to the menu.");
                            }

                            default -> System.out.println("No dessert added to the menu.");
                        }

                        System.out.println("\nWill there be a special cake for the occasion?");
                        System.out.print("Enter 1 for yes, or any other number for no: ");
                        int cake = Integer.parseInt(input.nextLine());

                        if (cake == 1) {
                            events.get(option4-1).setFood(Food.Spe01);
                            System.out.println(events.get(option4-1).eventName() + " Cake has been added to the menu.");
                        }
                        else {
                            System.out.println("No cake added to the menu.");
                        }

                        System.out.println("\nMenu for " + events.get(option4-1).eventName() + " has been set.\n");
                    }

                    else { // if no event has been created yet, print this and loop back to menu
                        System.out.println("\nNo events have been created. Please create an event first.\n");
                    }
                }

                case 3 -> { // 3. Add attendee to event
                    if (events.size() > 0) {
                        System.out.println("Which event would you like to add attendees to?");

                        for (int i = 0; i < events.size(); i++) {
                            System.out.println((i+1) + ". " + events.get(i).eventName());
                        }
                        System.out.print("\nEnter the number of event to select : ");
                        int option2 = Integer.parseInt(input.nextLine());

                        while (option2 < 0 || option2 > events.size()) {
                            System.out.println("\nEvent doesn't exist. Try again.");
                            System.out.print("Enter the number of event to select : ");
                            option2 = Integer.parseInt(input.nextLine());
                        }

                        System.out.println("\nAdding to attendee to - " + events.get(option2-1).getClass().getSimpleName());
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
                    else { // if no event has been created yet, print this and loop back to menu
                        System.out.println("\nNo events have been created. Please create an event first.\n");
                    }
                }

                case 4 -> { // 4. Print event's invitation cards
                    if (events.size() > 0) {
                        System.out.println("Which event would you to select?");

                        for (int i = 0; i < events.size(); i++) {
                            System.out.println((i+1) + ". " + events.get(i).eventName());
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
                            System.out.println("\nPrinting Invitation cards....\n");

                            System.out.println(events.get(option3-1).DisplayInvitation());

                            try (FileWriter printOutInvitation = new FileWriter(events.get(option3-1).eventName() + "_InvitationCards" + ".txt")) {
                                printOutInvitation.write(events.get(option3-1).DisplayInvitation());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            System.out.println("\nInvitation cards printed successfully. Please check root folder.\n");
                        }

                    }

                    else { // if no event has been created yet, print this and loop back to menu
                        System.out.println("\nNo events have been created. Please create an event first.\n");
                    }
                }

                case 5 -> System.out.println("\nThank you for using Event Management System. We hope to see you again! :)"); // 5, Exit
                default -> System.out.println("\nSorry, option not recognized. Please enter between 1 to 4.\n"); // Option not recognized, back to the menu selection
            }
        }

        System.exit(0);
    }
}
