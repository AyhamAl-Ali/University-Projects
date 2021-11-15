/**
 * Java 2 Inheritance Homework
 * Name: Ayham Al-Ali
 * Date: 10th of Dec 2020
 * UID: 201910486
 */


public class MusicVideo extends Video {

    private String artist;
    private String category;

    private static int noOfMusicVideo = 0;

    MusicVideo() {
        this("Unknown", 1, true, "Ayham Al-Ali", "Rap");
    }

    MusicVideo(String title, int length, boolean avail, String artist, String category) {
        super(title, length, avail);
        this.artist = artist;
        this.category = category;
        noOfMusicVideo++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getArtist() {
        return artist;
    }

    public static int getNoOfMusicVideo() {
        return noOfMusicVideo;
    }

    public void show() {
        super.show();
        println("Artist: " + artist);
        println("Category: " + category);
    }
}
