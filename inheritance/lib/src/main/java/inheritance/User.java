package inheritance;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Review> userReviews = new ArrayList<>();
    String name;

    public User(String name){
        this.name = name;
    }
    public boolean addReview(Review review){
        System.out.println(userReviews);
        System.out.println(review.name);
        if(!userReviews.contains(review.establishment)){
            userReviews.add(review);
            return true;
        }
        return false;
    }
    public void conductReview(Restaurant restaurant,String body,int stars){
        if(!userReviews.contains(restaurant.name)){
            System.out.println(restaurant.name);
            Review r = restaurant.addReview(body, restaurant.price, name,stars);
            r.name = restaurant.name;
            addReview(r);
        }else{
            System.out.println("User already reviewed this restaurant");
        }
    }
}
