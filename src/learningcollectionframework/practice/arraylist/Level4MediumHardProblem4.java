package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Level4MediumHardProblem4 {
    static void main() {

//        22. Movie Collection
//        Store movie names.
//                Features:
//                Display alphabetically
//                Search movie
//                Count movies
//                Remove movie

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Fast & Furious");
        movies.add("Rockstar");
        movies.add("Avengers");
        movies.add("Inception");

        MovieCollection collection = new MovieCollection(movies);

        System.out.println("Display alphabetically: " + collection.displayMovies());
        System.out.println("Is 'Finding Nemo' in the movie list: " + collection.searchMovie("Finding Nemo"));
        System.out.println("Count of movies in the list: " + collection.countMovies());

        collection.removeMovie("Fast & Furious");
        System.out.println("List after removing a movie: " + movies);

    }
}

class MovieCollection {

    ArrayList<String> movies;

    public MovieCollection(ArrayList<String> movies) {
        this.movies = movies;
    }

    public ArrayList<String> displayMovies() {
        Collections.sort(movies);
        return movies;
    }

    public boolean searchMovie(String name) {
        return movies.contains(name);
    }

    public Integer countMovies() {
        int count = 0;
        for (String movie : movies) {
            count++;
        }
        return count;
    }

    public void removeMovie(String name) {
        movies.remove(name);
    }

}
