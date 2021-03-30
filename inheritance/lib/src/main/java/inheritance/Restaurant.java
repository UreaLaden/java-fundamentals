package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Reviewable {
    public String name;
    private int stars;
    public String price;
    public List<Review> reviews = new ArrayList<>();

    public Restaurant(String name,String price, int stars){
        this.name = name;
        this.price = price;
        this.stars = stars;
    }
    public void ToString(){
        String message = String.format("Name: %s" + "\nStars: %d \nPrice: %s",name,
                stars,price);
        System.out.println("====================================");
        System.out.println(message);
        System.out.println("====================================");
        printReviews(reviews);
    }

    @Override
    public Review addReview(String body,String price, String author,int stars) {
        Review review = new Review(body,author,stars);
        review.restaurant = this.name;
        reviews.add(review);
        updateRating();
        return review;
    }

    @Override
    public void printReviews(List<Review> reviews) {
        updateRating();
        for(Review r:reviews){
            System.out.println(r.ToString());
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
        }
    }

    public void updateRating(){
        int total = 0;
        for(Review r:reviews){
            total += r.stars;
        }
        stars = total / reviews.size();
    }
    public int getRating(){
        updateRating();
        return stars;
    }
}
