package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class inheritanceTest {
    @Test public void testCreateRestaurant(){
        Restaurant restaurant = new Restaurant("Nandos","$$",4);
        String expected = "Name: Nandos\nStars: 4 \nPrice: $$";
        String actual = restaurant.toString();
        assertEquals("Should create a new restaurant",expected,actual);
    }
    @Test public void testCreateReview(){
        Review review = new Review("This place was complete trash","Drae",2);
        String expected = "Review: This place was complete trash\n" +
                "Author: Drae\n" +
                "Rating:2";
        String actual = review.ToString();
        assertEquals("Should create a new review:",expected,actual);
    }
    @Test public void testAddReview(){
        Restaurant r = new Restaurant("Papa Johns","$$$",2);
        r.addReview("Pizza was too greasy","$$$","Max",1);
        r.addReview("My pizza was cold","$$","Joe",2);
        r.addReview("Pretty sure i found a hair on my pizza","$$$","John",1);
        r.ToString();
        Restaurant s = new Restaurant("Billy Bobs", "$",5);
        s.addReview("Nice service","$$","Drae",5);
        s.ToString();
    }
    @Test public void testAddUserReview(){
        Restaurant kfc = new Restaurant("Kentucky Fried Chicken","$$",2);
        User me = new User("Leaundrae");
        me.conductReview(kfc,"Chicken was not as spicey as it should be",3);
        me.conductReview(kfc,"Really wish they had apple pies",2);
    }
}
