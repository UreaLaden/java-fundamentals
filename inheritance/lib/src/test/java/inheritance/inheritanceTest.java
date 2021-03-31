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
        User user = new User("Drae");
        Restaurant r = new Restaurant("Barbados","$$$$",2);
        r.addReview("This place was complete trash","$$$$",user.name,
                2);
        String expected = "Name: Barbados\n" +
                "Review: This place was complete trash\n" +
                "Author: Drae\n" +
                "Rating:2";
        String actual = r.reviews.get(0).ToString();
        assertEquals("Should create a new review:",expected,actual);
    }
    @Test public void testAddReview(){
        Restaurant r = new Restaurant("Papa Johns","$$$",2);
        r.addReview("Pizza was too greasy","$$$","Max",1);
        r.addReview("My pizza was cold","$$","Joe",2);
        r.addReview("Pretty sure i found a hair on my pizza","$$$","John",1);
        r.toString();
        Restaurant s = new Restaurant("Billy Bobs", "$",5);
        s.addReview("Nice service","$$","Drae",5);
        s.toString();
    }
    @Test public void testAddUserReview(){
        Restaurant kfc = new Restaurant("Kentucky Fried Chicken","$$",2);
        User me = new User("Leaundrae");
        me.conductReview(kfc,"Chicken was not as spicey as it should be",3);
        me.conductReview(kfc,"Really wish they had apple pies",2);
    }
    @Test public void testCreateShop(){
        Shop shop = new Shop("The Spot","Really cool shop that sells stuff","$$");
        String expected = "The Spot";
        String actual = shop.name;
        assertEquals("Should create a shop and display its name",expected,actual);
    }
    @Test public void testShopToString(){
        Shop shop = new Shop("The spot","Nice place to buy things","$$$");
        String expected = "Name: The spot\n" +
                "Cost: Nice place to buy things\n" +
                "Description: $$$";
        String actual = shop.toString();
        assertEquals("Should display shop info ",expected,actual);
    }
    @Test public void testTheater(){
        Theater cinemax = new Theater("Cinemax");
        cinemax.addMovie("Beauty and the other beauty");
        cinemax.addMovie("The good guys");
        cinemax.addMovie("Never say maybe");
        int expected = 3;
        int actual = cinemax.movies.size();
        assertEquals("Should include 3 movies",expected,actual);
        String expected2 = "Name: Cinemax\n" +
                "Beauty and the other beauty\n" +
                "The good guys\n" +
                "Never say maybe";
        String actual2 =cinemax.toString();
        assertEquals("Should display Theater and list of movies",expected2,actual2);

        cinemax.removeMovie("Beauty and the other beauty");
        String expected3 = "Name: Cinemax\n" +
                "The good guys\n" +
                "Never say maybe";
        String actual3 =cinemax.toString();
        assertEquals("Should remove a movie on removeMovie",expected3,actual3);
    }
    @Test public void reviewTests(){
        Theater elCine = new Theater("elCine");
        elCine.addReview("Popcorn wasn't the greatest","$$$$","Leaundrae",3);
        elCine.printReviews(elCine.reviews);
        elCine.addReview("This places was great","$$$$","Bobby",5,"The last dragon");
        elCine.printReviews(elCine.reviews);

        Restaurant barLuwee = new Restaurant("barLuwee","$",3);
        barLuwee.addReview("This place is fun","$","Me",4,"Shouldn't work");
        barLuwee.printReviews(barLuwee.reviews);
        String expected = "Name: barLuwee\n" +
                "Stars: 4 \n" +
                "Price: $\n" +
                "Name: barLuwee\n" +
                "Review: This place is fun\n" +
                "Author: Me\n" +
                "Rating:4";
        String actual = barLuwee.toString();
        assertEquals("Should not print a movie title",expected,actual);
    }
}
