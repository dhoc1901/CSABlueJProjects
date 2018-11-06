
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
            String song = songInfo.substring(0,songInfo.indexOf("|"));
            System.out.println(song);
            songInfo = songInfo.substring(songInfo.indexOf("|"));
        }
    }
}
