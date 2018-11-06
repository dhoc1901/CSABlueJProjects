
/**
 * Write a description of class Movie here.
 *
 * @author David H
 * @version 10/9/18
 */
public class Movie
{
    // instance variables 
    private int rating;
    private String title;
    private int duration;
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
    }
    public Movie(String title, int duration, int rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }
    public int getDuration() {
        return duration;
    }
    
}
