import java.util.*;

public class MovieCollection
{
    private ArrayList<Movie> movies;

    public MovieCollection()
    {
        movies = new ArrayList<Movie>();
    }

    
    // adds a new movie to the movie collection and sort
    public void addMovie(String title, int year, double rating)
    {
        // Implement this method
        Movie newMovie = new Movie(title, year, rating);
        // Conditional for beginning of array
        if ((movies.size() == 0) || (newMovie.getRating() >= movies.get(0).getRating()))
        {
            movies.add(0, newMovie);
        }
        else if (newMovie.getRating() < movies.get(movies.size() - 1).getRating())
        {
            movies.add(newMovie);
        }
        else
        {
            for (int i = 0; i < movies.size() - 1; i++)
            {
                if (newMovie.getRating() <= movies.get(i).getRating() && newMovie.getRating() > movies.get(i+1).getRating())
                {
                    movies.add(i, newMovie);
                }
            }
        }
        System.out.println("Movie added successfully!");
    }
    

    // removes a movie from the movie collection
    // return true if movie was successfully removed
    // return false if movie cannot be found
    public boolean removeMovie(String title)
    {
        for(int i = 0; i < movies.size(); i++)
        {
            if (title.equals(movies.get(i)))
            {
                movies.remove(i);
                return true;
            }
        }
        return false;
    }

    // search for a movie
    // returns Movie object if exists
    // return null if movie is not in collection
    public Movie searchMovie(String title)
    {
        // Implement this method
        return null;
    }

    // displays all movies in the collection in order sorted by rating
    public void displayMovies()
    {
        System.out.println();
        if (movies.size() >= 1)
        {
            System.out.println("All the movies in your collection include: ");
            for (int i = 0; i < movies.size(); i++)
            {
                System.out.println((i + 1) + ". " + movies.get(i));
            }

        }
        else
        {
            System.out.println("There are no movies in your collection.");
        }
        System.out.println();
    }

    /*
    // sorts movies by rating - use Bubblesort
    private void sortMoviesByRating()
    {
        // Implement this method
    }
    */
}