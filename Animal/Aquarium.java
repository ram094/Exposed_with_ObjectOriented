
package Containers;

import animals.Fish;
import animals.Snails;

public class Aquarium 
{
    //make an array for fish and snails;
    //we are declaring arrays that hold a Fish objects or snail objects
    //There are  no Fish or Snail object yet-we are just saying
    //we have arrays ready to hold objects
    public Fish[] f= new Fish[2];
    public Snails[] s =new Snails[2];
    public void addFish()
    {
        for(int i =0; i<f.length; i++)
        {
            System.out.println("***\nFish "+(i+1));
            f[i] = new Fish();
            //creates a Fish object and put it in the first index of the Fish array f
            
            //give colors to our newly creared Fish object
            f[i].giveColors(2);                    
        }
        System.out.println();
    }
    //same concept as the addFish() method-see above
    public void addSnail()
    {
        for(int i=0; i<s.length; i++)
        {
            System.out.println("***\nSnail "+(i+1));
            s[i] = new Snails();
            s[i].giveColors(2);
            
            s[i].snailType();
        }        
    }
    public void printAquariumInfo()
    {
        if(f[0]==null||s[0]==null)
        {
            System.out.println("Aquarium not full yet!");
            
        }
        else
        {
            System.out.println("\n***Fish:");
            for(int i=0; i<f.length; i++)
            {
                System.out.println("-Fish"+(i+1));
                System.out.println("Type:"+f[i].type);
                for(int j=0; j<f[i].colors.length; j++)
                {
                    System.out.println(f[i].colors[j]);
                }
            }
            System.out.println("\n***Snails:");
            for(int i=0;i<s.length;i++)
            {
                System.out.println("-Snail"+(i+1));
                System.out.println("Type:"+s[i].getType());
                
                for(int j=0; j<s[i].colors.length; j++)
                {
                    System.out.println(f[i].colors[j]);
                }
                System.out.println();
            }
        }
    }
}