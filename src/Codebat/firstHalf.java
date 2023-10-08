package Codebat;
//firstHalf("WooHoo") → "Woo"
//firstHalf("HelloThere") → "Hello"
//firstHalf("abcdef") → "abc"
public class firstHalf {

    public static void main(String[] args) {
    firstHalf firstletters = new firstHalf();
        System.out.println(firstletters.firstHalf("WooHoo"));
    }

    public String firstHalf(String str) {

        return str.substring(0,str.length()/2);

    }
}


//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


