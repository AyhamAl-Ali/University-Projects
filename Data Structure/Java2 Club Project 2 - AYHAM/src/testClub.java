/**
 *
 * Java2 Lab 8
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 14th of December 2020
 *
 */

import java.util.Scanner;

public class testClub {

    // coloring
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    static Club[] members = new Club[10];

    public static void main(String[] args) {

        for (int i = 0; i < members.length; i++) {
            int c = i + 1; // counter
            Scanner sc = new Scanner(System.in);

            print("Visitor (" + c + "): is a 'member' or a 'guest'? ");
            String type = sc.next();
            if (!type.equals("member") && !type.equals("guest")) {
                println(ANSI_RED + "ERROR: Unknown visitor type." + ANSI_RESET);
                i--; // go one step back
                continue; // restart
            }

            sc.nextLine(); // goes to next line to fix nextLine skip of scanner

            print("Enter Name of visitor (" + c + "): ");
            String name = sc.nextLine();

            if (type.equals("member")) {
                String participation;

                while (true) {
                    print("Enter the participation of visitor (" + c + "): ");
                    participation = sc.next();

                    if (!participation.equals("weekly") && !participation.equals("monthly") && !participation.equals("yearly")) {
                        println(ANSI_RED + "ERROR: participation can only be 'weekly', 'monthly', 'yearly'." + ANSI_RESET);
                        continue; // restart
                    }

                    break; // get out of while
                }

                members[i] = new Members(name, participation);
            }

            else if (type.equals("guest")) {

                print("Enter the price per hour of visitor (" + c + "): ");
                double pricePerHour = sc.nextDouble();

                print("Enter the hours of visitor (" + c + "): ");
                int hours = sc.nextInt();

                members[i] = new Guests(name, pricePerHour, hours);

            }

        }

        println("\n\nInformation of all visitors");
        println("----------------------------");
        int co = 1;
        for (Club c : members) {
            println(ANSI_GREEN + "> Visitor (" + co + "): " + ANSI_RESET);
            println("   Name of visitor: " + c.visitorName);
            if (c instanceof Guests) {
                println("   Visitor is type of: Guests");
                println("   Hours of visitor: " + ((Guests) c).hours);
                println("   Price per hours of visitor:  " + ((Guests) c).pricePerHour);
                println("   Fees of visitor: " + ((Guests) c).findCost());
            }
            else if (c instanceof Members) {
                println("   Visitor is type of: Members");
                println("   Participation of visitor: " + ((Members) c).participation);
                println("   Fees of visitor: " + ((Members) c).fees);
            }
            println(""); // newline
            co++;
        }
        println("----------------------------");
        printInfo();

    }

    public static void println(String s) { System.out.println(s); };

    public static void print(String s) { System.out.print(s); }

    public static void printInfo() {
        int membersCount = 0;
        int guestsCount = 0;

        for (Club c : members)
        if (c instanceof Members) {
            membersCount++;
        }
        else if (c instanceof Guests) {
            guestsCount++;

        }

        println(">> Number of members: " + membersCount);
        println(">> Number of guests: " + guestsCount);

    }


}
