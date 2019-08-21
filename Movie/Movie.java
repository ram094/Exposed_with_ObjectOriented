//Movie class with titlle(string), year (int), movieLength(double)
public class Movie
{
    private String title;
    private int year;
    private double runTime;
    //constructor
    public Movie(String movie_name, int yr, double movieLength)
    {
        title = movie_name;
        year = yr;
        movieLength = runTime;
    }
    //setter function to set movie title
    public void set_title(String movie_name) 
    {
        title = movie_name;
    }
    //setter function to set the movie year
    public void set_year(int yr)
    {
        year = yr;
    }
    //setter function to set the total runTime of a movie
    public void set_runTime( double movieLength)
    {
        runTime = movieLength;
    }
    //getter funciton to get the movie year
    public int get_year() 
    {
        return year;
    }
    //getter function to get the movie runTime
    public double get_runTime() {
       return runTime;
    }
    //getter function to get the title of the movie
    public String get_title() 
    {
        return title;

    }
    public void print_Everything()
    {
        System.out.println("Movie: "+title+"\tYear: "+year+"\trunTime: "+runTime+"\n");
    }
    
}
