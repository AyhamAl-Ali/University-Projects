/**
 *
 * Java2 Lab 8
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 14th of December 2020
 *
 */


public class Members extends Club {

    double fees;
    String participation;

    Members() {
        this("Unknown Name", "weekly");
    }

    Members(String visitorName, String participation) {
        this.visitorName = visitorName;
        if (!participation.equals("weekly") && !participation.equals("monthly") && !participation.equals("yearly")) {
            println("ERROR: participation can only be 'weekly', 'monthly', 'yearly'.");
            //return;
        }

        this.participation = participation;
        this.fees = findCost();
    }

    @Override
    double findCost() {/*
        if ( participation.equals("weekly") )
            return 15;
        else if ( participation.equals("monthly") )
            return 50;
        else if ( participation.equals("yearly") )
            return 110;
        else {
            println("ERROR: Unknown participation type. (" + participation + ")");
            return 0;
        }*/

        switch (participation) {
            case "weekly":
                return 15;
            case "monthly":
                return 50;
            case "yearly":
                return 110;
            default:
                println("ERROR: Unknown participation type. (" + participation + ")");
                return 0;
        }
    }


}
