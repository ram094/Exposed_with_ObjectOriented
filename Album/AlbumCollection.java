/*
 ram kharel
 1001539681
 12/08/2017
 */
package albumStuff;

import java.util.*;

public class AlbumCollection 
{
    static ArrayList<Album> collection = new ArrayList();
    Scanner in = new Scanner(System.in);
    
    //constructor
    public AlbumCollection()
    {
        String fileName = FileIO.getUserInput("Enter file name: ");
        ArrayList <String> fileInfo = FileIO.readFile(fileName);
        
        for(int i =0; i<fileInfo.size(); i++)
        {
            String st = fileInfo.get(i);
            
            String[] info =FileIO.getInfo(st,"-|\\(|\\)");
            
            Album a = new Album(info);
            collection.add(a);
        }
        
    }
    public static ArrayList<String> pOutAlbumName()
    { 
        ArrayList <String> years = new ArrayList(); //add songs here evry time we count the album
        ArrayList<String> AlbumName = new ArrayList(); 
        //FileIO.getUserInput("***Albums by years***\n");
        AlbumName.add("***Albums by years***\\n");
        for(int i=0; i<collection.size();i++)
        {
            Album a = collection.get(i);
            if(years.contains(a.year))
            {
               continue;
              
            }
            else
            {
                years.add(a.year);
                //System.out.println("\n--"+a.year);
                AlbumName.add("--"+a.year);
                for(int j =0; j<collection.size();j++)
                {
                    //Album a1 = collection.get(j);
                    if(a.year.equals(collection.get(j).year))
                    {
                        AlbumName.add(collection.get(j).albumName);
                    }    
                }
                AlbumName.add("");          
            }
        }
        for(int i=0; i<AlbumName.size();i++)
        {
            System.out.println(AlbumName.get(i));
        }
        return AlbumName;
    }
}
