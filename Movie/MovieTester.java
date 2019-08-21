import java.util.Scanner;

public class MovieTester 
{
    public static void main(String[] args) 
    {
        for(int i=0; i<3; i++)
        {
            Movie m1 = new Movie("name", 0, 0.0);
            Scanner read = new Scanner(System.in);

            System.out.print("Enter movie Title: ");
            String name = read.nextLine();
            m1.set_title(name);
            //m1.get_title();

            System.out.print("Enter movie Year: ");
            int Year = read.nextInt();
            m1.set_year(Year);
            //m1.get_year();

            System.out.print("Enter movie RunTime: ");				
            double runTime = read.nextDouble();
            m1.set_runTime(runTime);
           // m1.get_runTime();
            
            System.out.print("\n");
            m1.print_Everything();
        }
        
    }
		
}

