
/**
 * 
 *
 * @author David H
 * @version 11/6/18
 */
public class LoopingMediaLib
{
    public static void main()
    {
        String songInfo = MediaFile.readString();
        while (songInfo != null)
        {
            int songBar = songInfo.indexOf("|");
            String songName = songInfo.substring(0,(songBar - 1));
            String songRate = songInfo.substring(songBar + 2);
            System.out.println("Title: " + songName);
            System.out.println("Rating: " + songRate);
            songInfo = MediaFile.readString();
        }
    }
}
