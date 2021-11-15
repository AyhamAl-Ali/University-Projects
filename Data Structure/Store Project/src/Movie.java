/**
 * Java 2 Inheritance Homework
 * Name: Ayham Al-Ali
 * Date: 10th of Dec 2020
 * UID: 201910486
 */

public class Movie extends Video {

    private String director;
    private String rating;
    private static int noOfMovie = 0;


    Movie() {
        this("MOVIE", 1, true, "Ayham Al-Ali", "good");
    }

    Movie(String title, int length, boolean avail, String director, String rating) {
        super(title, length, avail);
        this.director = director;
        this.rating = rating;
        noOfMovie++;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    public static int getNoOfMovie() {
        return noOfMovie;
    }

    public void show() {
        super.show();
        println("Director: " + director);
        println("Rating: " + rating);
    }
}
