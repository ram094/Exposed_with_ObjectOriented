/*
 ram kharel
 1001539681
 12/08/2017
*/

package albumStuff;

public class Album 
{
    public String artistName;
    public String albumName;
    public String year;
    //constructor
    public Album (String[] i)
    {
        artistName = i[0].trim();
        albumName =i[1].trim();
        year =i[2].trim();
    }
    
}
