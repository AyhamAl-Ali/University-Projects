/**
 *
 * Java2 Lab 11
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 9th of Jan 2021
 *
 */


public class Members extends Club implements InterfaceDiscount {

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

        switch (participation) {
            case "weekly":
                fees = 15;
                break;
            case "monthly":
                fees = 50;
                break;
            case "yearly":
                fees = 110;
                break;
        }

    }

    @Override
    double findCost() {
        return fees - calcDiscount();
    }


    @Override
    public double calcDiscount() {
        return fees * dicount_percentage;
    }
}
