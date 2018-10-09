
/**
 * Write a description of class Book here.
 *
 * @author David H
 * @version 10/9/18
 */
public class Book
{
    // instance variables 
    private int rating;
    private String title;
    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }
    public Book( String title, int rating){
        this.title = title;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }
}
