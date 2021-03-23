import java.time.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        // System.out.println(pluralize("dog",3));
        // System.out.println(pluralize("dog",1));
        // clock();        
        flipNHeads(6);
    }

    public static String pluralize(String thing, int amount){        
        String result = amount > 1 ? thing + "s" : thing;
        return  result;
    }

    public static void clock(){
       

        while(true)
        {
            LocalDateTime time = LocalDateTime.now();
            int hour = time.getHour();
            int minute = time.getMinute();
            int seconds = time.getSecond();
            System.out.println(hour + ":" + minute + ":" + seconds);
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch(Exception e){}
        }       
    }

    public static void flipNHeads(int n){
        int counter = 1;
        int headCounter = 0;
        int tryCounter = 0;
        while(headCounter <= n){
            Random rnd = new Random();
            double chance = rnd.nextDouble();
            String call = chance < .5 ? "tails" : "heads";
            System.out.println(call);
            headCounter += call == "heads" ? 1 : 0;
            if(headCounter == n){break;}
            counter++;
        }
        System.out.println("It took " + counter + " " + pluralize("flip",counter) + " to flip " + headCounter +" " + pluralize("head",headCounter) +  " in a row");
    }
}