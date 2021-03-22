public class Main{
    public static void main(String[] args){
        System.out.println(pluralize("dog",3));
        System.out.println(pluralize("dog",1));
    }

    public static String pluralize(String thing, int amount){        
        String result = amount > 1 ? thing + "s" : thing;
        return "I own " + amount + " " + result;
    }
}