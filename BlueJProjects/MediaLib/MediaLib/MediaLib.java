
/**
 * Write a description of class MediaLib here.
 *
 * @author David H
 * @version 10/9/18
 */
public class MediaLib
{
    private double totalCost;
    private int numSongs;
    private int totalRatings;
    private double avgCost;
    private double avgRating;
    
    public static void main() 
   {double totalCost = 0.0;
    int numSongs = 0;
    int totalRatings = 0;
    double avgCost = 0.0;
    double avgRating = 0.0;
    
    System.out.println("Welcome to your Media Library");
    System.out.println();

    System.out.println("Songs:");
    Song song1 = new Song("Johnny B. Goode", 1.99, 4);
    Song song2 = new Song("The Trial", 1.99, 5);
    Song song3 = new Song("Mother", .99, 5);
    Song song4 = new Song("Bring the Boys Back Home", 1.85, 4);
    Song song5 = new Song("Great Blue Skies", .66, 4);
    Song song6 = new Song("Beyond the Wall", .75, 3);
    Song song7 = new Song("Comfortably Numb", 1.99, 5);
    Song song8 = new Song("In the Flesh", .99, 4);
    System.out.println(song1);
    System.out.println(song1.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song1.getRating());
    System.out.println("Price: $" + song1.getPrice());
    totalCost += song1.getPrice();
    totalRatings += song1.getRating();
    System.out.println(song2);
    System.out.println(song2.getTitle());
    numSongs = numSongs + 1;
    System.out.println("Rating: " + song2.getRating());
    System.out.println("Price: $" + song2.getPrice());
    totalCost += song2.getPrice();
    totalRatings += song2.getRating();
    System.out.println(song3);
    System.out.println(song3.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song3.getRating());
    System.out.println("Price: $" + song3.getPrice());
    totalCost += song3.getPrice();
    totalRatings += song3.getRating();
    System.out.println(song4);
    System.out.println(song4.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song4.getRating());
    System.out.println("Price: $" + song4.getPrice());
    totalCost += song4.getPrice();
    totalRatings += song4.getRating();
    System.out.println(song5);
    System.out.println(song5.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song5.getRating());
    System.out.println("Price: $" + song5.getPrice());
    totalCost += song5.getPrice();
    totalRatings = totalRatings + song5.getRating();
    System.out.println(song6);
    System.out.println(song6.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song6.getRating());
    System.out.println("Price: $" + song6.getPrice());
    totalCost += song6.getPrice();
    totalRatings += song6.getRating();
    System.out.println(song7);
    System.out.println(song7.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song7.getRating());
    System.out.println("Price: $" + song7.getPrice());
    totalCost += song7.getPrice();
    totalRatings += song7.getRating();
    System.out.println(song8);
    System.out.println(song8.getTitle());
    numSongs += 1;
    System.out.println("Rating: " + song8.getRating());
    System.out.println("Price: $" + song8.getPrice());
    totalCost += song8.getPrice();
    totalRatings += song8.getRating();
    System.out.println("Number of Songs: " + numSongs);
    System.out.println("Total Cost: $" + totalCost);
    System.out.println("Total Ratings: " + totalRatings);
    avgCost = totalCost / numSongs;
    System.out.println("Average Cost: $" + avgCost);
    avgRating = (double) totalRatings / numSongs;
    System.out.println("Average Rating: " + avgRating);
    System.out.println();
    
    System.out.println("Books:");
    Book book1 = new Book("Foundation", 3);
    System.out.println(book1);
    System.out.println(book1.getTitle());
    System.out.println(book1.getRating());
    System.out.println();
    
    System.out.println("Movies:");
    Movie movie1 = new Movie("Pirates of the Carribean", 97, 2);
    Movie movie2 = new Movie("Spider-man", 134, 4);
    Movie movie3 = new Movie("A Cure for Wellness", 199, 5);
    System.out.println(movie1);
    System.out.println(movie1.getTitle());
    System.out.println("Rating: " + movie1.getRating());
    System.out.print("Duration: " + (movie1.getDuration()/60) + ":" + (movie1.getDuration() % 60) + " ");
    System.out.println("Hours");
    System.out.println(movie2);
    System.out.println(movie2.getTitle());
    System.out.println("Rating: " + movie2.getRating());
    System.out.print("Duration: " + (movie2.getDuration()/60) + ":" + (movie2.getDuration() % 60) + " ");
    System.out.println("Hours");
    System.out.println(movie3);
    System.out.println(movie3.getTitle());
    System.out.println("Rating: " + movie3.getRating());
    System.out.print("Duration: " + (movie3.getDuration()/60) + ":" + (movie3.getDuration() % 60) + " ");
    System.out.println("Hours");
}
}
