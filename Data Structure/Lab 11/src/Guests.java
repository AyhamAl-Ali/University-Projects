/**
 *
 * Java2 Lab 11
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 9th of Jan 2021
 *
 */

public class Guests extends Club {

    double pricePerHour;
    int hours;

    Guests() {
        this("Unknown Visitor", 1,1);
    }

    Guests(String visitorName, double pricePerHour, int hours) {
        this.visitorName = visitorName;
        this.pricePerHour = pricePerHour;
        this.hours = hours;
    }


    @Override
    double findCost() {
        return pricePerHour * hours;
    }

}
