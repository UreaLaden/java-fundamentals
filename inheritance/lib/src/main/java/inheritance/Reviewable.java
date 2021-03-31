package inheritance;

import java.util.List;

public interface Reviewable {
    Review addReview(String body,String price,String author,int stars);
    void addReview(String body, String price, String author, int stars, String movie);
    void printReviews(List<Review> reviews);
}
