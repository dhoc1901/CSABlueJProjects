
/**
 * Write a description of class Song here.
 *
 * @author David H
 * @version 9/24/18
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }   
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }
    public double getPrice() {
        return price;   
    }
    public void addToFavorites() {
        favorite = true;
    }
    
}
