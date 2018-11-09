
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author David H
 * @version 11/9/18
 */
public class ArrayMediaLib
{
    public static void main(){
        //int[] daysBetweenPurchase = {2,5,1,2,4,2,1,3};
        //int total = 0;
        //float averagePurchaseTime = 0;
        //for (int i =0; i < daysBetweenPurchase.length; i++){
        //    total += daysBetweenPurchase[i];
        //}
        //averagePurchaseTime = (float)total/daysBetweenPurchase.length;
        //System.out.println("Average Purchase Time: " + averagePurchaseTime);
        Song[] topTenSongs = { new Song("American Nightmare"),
                               new Song("Stabbing in the Dark"),
                               new Song("Thank God it's Friday"),
                               new Song("The Jig is Up"),
                               new Song("IT is the End"),
                               new Song("Time"),
                               new Song("The Show Must Go On"),
                               new Song("In the Flesh"),
                               new Song("Run Like Hell"),
                               new Song("I don't like Mondays"),
                               
        };
        for (Song s: topTenSongs){
            System.out.println(s.getTitle());
        }
            // change the array
        System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
           // show the array
        /*System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }
        for (int i = 0; i < topTenSongs.length; i++){
            topTenSongs[i] = new Song("test");
        }*/
        for (Song s: topTenSongs){
            System.out.println(s.getTitle());
        }
        for (Song t: topTenSongs){
            t.setPrice(1.29);
        }
        for (int i = 0; i < topTenSongs.length; i ++){
            if((i+1) % 3 == 0){
            topTenSongs[i].setPrice(.99);
        }
        }
        for (Song s: topTenSongs){
            System.out.println(s.getTitle());
            System.out.println(s.getPrice());
        }
    }
}
