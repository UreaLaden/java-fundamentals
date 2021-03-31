package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Reviewable {

    public String name;
    public String price;
    private int stars;
    private Establishment establishment;
    public List<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String price, int stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;
        this.establishment = Establishment.Restaurant;
    }

    public String toString() {
        String message = String.format("Name: %s" + "\nStars: %d \nPrice: %s", name,
                stars, price);
        String review = "";
        for(Review r:reviews){
            if(reviews.indexOf(r)!= reviews.size()-1){
                review += r.ToString() + "\n";
            }else{
                review += r.ToString();
            }
        }
        return message + "\n" + review;
    }

    @Override
    public Review addReview(String body, String price, String author, int stars) {
        Review review = new Review(body, author, stars, Establishment.Restaurant);
        review.name = this.name;
        reviews.add(review);
        updateRating();
        return review;
    }

    @Override
    public void addReview(String body, String price, String author, int stars, String movie) {
        addReview(body,price,author,stars);
    }

    @Override
    public void printReviews(List<Review> reviews) {
        updateRating();
        for (Review r : reviews) {
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
            System.out.println(r.ToString());
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
        }
    }

    public void updateRating() {
        int total = 0;
        for (Review r : reviews) {
            total += r.stars;
        }
        stars = total / reviews.size();
    }

    public int getRating() {
        updateRating();
        return stars;
    }
}
