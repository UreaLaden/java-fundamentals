package inheritance;

public class Review {
    String name;
    String body;
    String author;
    String movie;
    Establishment establishment;
    int stars;

    public Review(String body,String author,int stars,Establishment establishment){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.name = null;
        this.movie = null;
        this.establishment = establishment;
    }

    public String ToString(){
        String message1 = String.format("Name: %s\nReview: %s\nAuthor: %s\nRating:%d",
                name,body,author,stars);
        String message2 = String.format("Name: %s\nReview: %s\nAuthor: %s\nRating:%d\nMovie: %s",
                name,body,author,stars,movie);
        return establishment == Establishment.Theater ? message2 : message1;
    }
}

