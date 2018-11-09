
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author David H
 * @version 11/6/18
 */
public class FavoritesMediaLib
{
    public static void main(){
        String songInfo = MediaFile.readString();
        while (songInfo != null)
        {
            try{
            String song = songInfo.substring(0,songInfo.indexOf("|"));
            System.out.println("Title: " + song);
            String songInfo2 = songInfo.substring(songInfo.indexOf("|"));
            songInfo2 = songInfo2.substring(1);
            songInfo = songInfo2.substring(1);
            String rate = songInfo2.substring(1, songInfo2.indexOf("|"));
            System.out.println("Rating: " + rate);
            String songInfo3 = songInfo.substring(songInfo.indexOf("|"));
            songInfo3 = songInfo3.substring(1);
            songInfo = songInfo3;
            
        }
        
        catch(Exception e){
            break;
        }
    }
    }
}
