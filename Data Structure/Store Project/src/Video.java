/**
 * Java 2 Inheritance Homework
 * Name: Ayham Al-Ali
 * Date: 10th of Dec 2020
 * UID: 201910486
 */

public class Video {

    private String title;
    private int length;
    private boolean avail;
    private static int noOfVideo = 0;


    Video() {
        this("Unknown", 1, true);
    }

    Video(String title, int length, boolean avail) {
        this.title = title;
        this.length = length;
        this.avail = avail;
        noOfVideo++;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvail() { // getAvail, but isAvail is more logical
        return avail;
    }

    public static int getNoOfVideo() {
        return noOfVideo;
    }

    public void show() {
        println("Title: " + title);
        println("Length: " + length);
        println("Is Available?: " + avail);
    }


    public void println(String s) {
        System.out.println(s);
    }
    public void print(String s) {
        System.out.print(s);
    }
}
