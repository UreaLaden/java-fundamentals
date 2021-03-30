package inheritance;

public class Review {
    String restaurant;
    String body;
    String author;
    int stars;

    public Review(String body,String author,int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = null;
    }

    public String ToString(){
        String message = String.format("Restaurant: %s\nReview: %s\nAuthor: %s\nRating:%d",
                restaurant,body,author,stars);
        return message;
    }
}
