/**
 * Java 2 Inheritance Homework
 * Name: Ayham Al-Ali
 * Date: 10th of Dec 2020
 * UID: 201910486
 */

public class TestMovie {

    public static void main(String[] args) {

        // Print the no. of Video and Movie objects before creating and after creating.
        println("Number of Video objects: " + Video.getNoOfVideo());
        println("Number of Movie objects: " + Movie.getNoOfMovie());

        // Create one object of Video.
        Video video = new Video("Avengers: End Game", 182, true);

        // Print the information of this object.
        println("\nVideo 1 information:");
        video.show();

        // Create two objects of Movie.
        Movie movie1 = new Movie("Movie One", 20, true, "Ayham Al Ali", "G");
        Movie movie2 = new Movie("Movie Two", 30, false, "Ayham Al Ali", "G");

        // Print the information of these objects.
        println("\nMovie 1 information:");
        movie1.show();
        println("\nMovie 2 information:");
        movie2.show();

        // Print the no. of Video and Movie objects before creating and after creating.
        println("\nNumber of Video objects: " + Video.getNoOfVideo());
        println("Number of Movie objects: " + Movie.getNoOfMovie());

        // Create an object of MusicVideo.
        MusicVideo musicVideo = new MusicVideo("Music Video One", 5, true, "Ayham Al Ali", "Rap");

        // Print the information of MusicVideo object.
        println("\nMusicMovie 1 information:");
        musicVideo.show();

        // Print the no. of Video and MusicVideo objects.
        println("\nNumber of Video objects: " + Video.getNoOfVideo());
        println("Number of MusicMovie objects: " + MusicVideo.getNoOfMusicVideo());

    }


    public static void println(String s) {
        System.out.println(s);
    }
}
