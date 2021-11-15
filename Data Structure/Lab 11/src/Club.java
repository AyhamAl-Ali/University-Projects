/**
 *
 * Java2 Lab 11
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 9th of Jan 2021
 *
 */

public abstract class Club {


    String visitorName;

    Club() {
        this("Unknown");
    }

    Club(String visitorName) {
        this.visitorName = visitorName;
    }

    double findCost() {
        return 0;
    }


    public void println(String s) {
        System.out.println(s);
    }
    public void print(String s) {
        System.out.print(s);
    }

}
