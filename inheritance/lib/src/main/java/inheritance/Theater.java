package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements Reviewable {
    String name;
    List<String> movies = new ArrayList<>();
    List<Review> reviews = new ArrayList<>();

    public Theater(String name){
        this.name = name;
    }
    public void addMovie(String movie){
        movies.add(movie);
    }
    public void removeMovie(String movie){
        int idx = movies.indexOf(movie);
        movies.remove(idx);
    }
    public String toString(){
        String message = String.format("Name: %s",name);
        String currentMovies = "";
        for(String m:movies){
            if(movies.indexOf(m) != movies.size()-1)
            {
                currentMovies += m +"\n";
            }else{
                currentMovies += m;
            }
        }
        return message + "\n" + currentMovies;
    }

    @Override
    public Review addReview(String body, String price, String author, int stars) {
        return null;
    }

    @Override
    public void addReview(String body, String price, String author, int stars, String movie) {
        Establishment establishment = Establishment.Theater;
        Review r = new Review(body,author,stars,establishment);
        r.name = name;
        r.movie = movie;
        reviews.add(r);
        System.out.println(r.ToString());
    }

    @Override
    public void printReviews(List<Review> reviews) {
        System.out.println(this.toString());
        for(Review r:reviews){
            System.out.println(r.ToString());
        }
    }
}
