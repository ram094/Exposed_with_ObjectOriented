package animals;

import java.util.Scanner;

public class Snails {
    public String [] colors;
    //this private-not accessible outside the class
    private String type;
    
    public void giveColors(int num)
    {
        //Snails s1=new Snails();
        colors = new String[num];
        Scanner in =new Scanner(System.in);
        for(int i=0; i<colors.length;i++)
        {
            System.out.printf("Enter color %d: \n", i+1);
            colors[i]=in.nextLine();
        }
    }
//Since the type attribute is private, we use a public method to give access
//here, we are accessing to give a value to type    
    public void snailType()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter snail type:");
        type = in.nextLine();
    }
    public String getType()
    {
        return type;
    }
    
   //static, so don't need object-can just call class directly
    public static void crawl()
    {
        System.out.println("~~~~~~snail is crawling~~~~~");
    }
}