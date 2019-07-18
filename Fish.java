package animals;

import java.util.Scanner;
public class Fish 
{
    //for the characterstics of our fish object
    public String[] colors;
    public String type;
    
    //methods, action on or from our fish object
    public void giveColors(int num)
    {
        colors = new String[num];
        Scanner in =new Scanner(System.in);
        for(int i=0; i<colors.length;i++)
        {
            System.out.printf("Enter color %d:\n", i+1);
            colors[i]=in.nextLine();
        }
                
    }
    public static void fishSwim()
    {
        System.out.println("Swimming...~~~~~~~");
    }
    
}
