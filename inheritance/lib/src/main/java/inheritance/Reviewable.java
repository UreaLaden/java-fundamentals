package inheritance;

import java.util.List;

public interface Reviewable {
    Review addReview(String body,String price,String author,int stars);
    void printReviews(List<Review> reviews);
}
