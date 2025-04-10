import java.util.*;
public class MovieManager
{
    /* The main method to control program.
    Should prompt user to collect details
    and provide control for the user through
    a console program.  Here is an example of
    the output your program should provide.

    Welcome to the Movie Collection Manager!
    1. Add a Movie
    2. Remove a Movie
    3. Search for a Movie
    4. Display all Movies
    5. Exit

    Enter your choice: 1
    Enter movie title: Inception
    Enter release year: 2010
    Enter rating (out of 10): 8.8
    Movie added successfully!
    */ 
   public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();
        int choice = scanner.nextInt();


        while (choice != 5)
        {
            writeOptions();
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1)
            {
                System.out.print("Movie title: ");
                String title = scanner.nextLine();
                System.out.print("Movie year: ");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.print("Movie rating [0.0 - 10.0]: ");
                double rating = Double.parseDouble(scanner.nextLine());
                movieCollection.addMovie(title, year, rating);
            }
            /*
            else if (choice == 2)
            {
                System.out.print("Movie title: ");
                String title = scanner.nextLine();
                System.out.print("Movie year: ");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.print("Movie rating [0.0 - 10.0]: ");
                double rating = Double.parseDouble(scanner.nextLine());
                movieCollection.addMovie(title, year, rating);
            }
            */
        }


    }

    public static void writeOptions()
    {
        System.out.println("Welcome to the Movie Manager!");
        System.out.println("1. Add a Movie");
        System.out.println("2. Remove a Movie");
        System.out.println("3. Search for a Movie");
        System.out.println("4. Display all Movies");
        System.out.println("5. Exit");
        System.out.print("Enter a number: ");
    }    
}