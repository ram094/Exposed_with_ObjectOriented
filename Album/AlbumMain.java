/*
 ram kharel
 1001539681
 12/08/2017
*/

package albummain;

import albumStuff.AlbumCollection;
import albumStuff.FileIO;
import java.util.ArrayList;


public class AlbumMain
{
    public static void main(String[] args) 
    {
        AlbumCollection ac = new AlbumCollection();
     
        
       ArrayList<String> s = ac.pOutAlbumName();
       FileIO.fileOutputObj(s);        
    }
    
}
