/*
 ram kharel
 1001539681
 12/08/2017
 */
package albumStuff;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO 
{
    public static String getUserInput(String message)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
    public static String[][] genFile()
    {
        ArrayList<String> lines=null; 
        Scanner in=new Scanner(System.in);

        while(lines==null)
        {
            System.out.println("Enter file name:");
            String fileName=in.nextLine();
            lines=readFile(fileName);
        }
        String [][]result=new String[lines.size()][]; 
        for (int i = 0; i < lines.size(); i++)
        {
            String line = lines.get(i); 
            result[i] = line.split(","); /*Split by the comma and put resulting array into result at index i. */
        }
        return result;
    }
 
 
    public static ArrayList<String>readFile(String filename)
    {
        File temp=new File(filename);
        Scanner input_file;
        try
        {
            input_file=new Scanner(temp);
        }
        catch(Exception e)
        {
            System.out.printf("Failed to open file %s\n\n",filename); 
            return null;
        }
        ArrayList<String>result=new ArrayList();
        while(input_file.hasNextLine())
        {
            String line=input_file.nextLine();
            result.add(line);
        }
        input_file.close();
        return result;
    }
    public static String [] getInfo(String s, String regex)
    {
        String[] info = s.split(regex);
        return info;
    }
    public static void fileOutputObj(ArrayList<String> toFile)
    {
        String filename = getUserInput("Enter filename to save to:");
        PrintWriter out = null;
        try{
        out = new PrintWriter(filename);
        }
        catch(Exception e)
        {
            System.out.printf("Error: failed to open file %s.\n", filename);
            System.exit(0);
        }
        for(int i=0;i<toFile.size();i++) 
        {
        out.println(toFile.get(i));
        }
       out.close();
       System.out.printf("Done writing to file %s.\n", filename);
    }
}
