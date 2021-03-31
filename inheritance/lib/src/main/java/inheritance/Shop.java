package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable{
    String name;
    String description;
    String cost;
    List<Review> currentReviews = new ArrayList<>();

    public Shop(String name,String description,String cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public String toString(){
        String message = String.format("Name: %s\nCost: %s\nDescription: %s",name,description,cost);
        return message;
    }

    @Override
    public Review addReview(String body, String price, String author, int stars) {
        Review review = new Review(body,author,stars,Establishment.Shop);
        currentReviews.add(review);
        return review;
    }

    @Override
    public void addReview(String body, String price, String author, int stars, String movie) {
        addReview(body,price,author,stars);
    }

    @Override
    public void printReviews(List<Review> reviews) {
        for(Review r:reviews){
            System.out.println(r.ToString());
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
        }
    }
}
