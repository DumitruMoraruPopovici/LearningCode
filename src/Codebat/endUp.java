package Codebat;
//endUp("Hello") → "HeLLO"
//endUp("hi there") → "hi thERE"
//endUp("hi") → "HI"
public class endUp {

    public static void main(String[] args) {
    endUp word = new endUp();
        System.out.println(word.endUp("hello"));
    }

    public String endUp(String str) {

    if(str.length() < 4){
        return str.toUpperCase();
    }
    int cut = str.length() - 3;
    String first = str.substring(0,cut);
    String last = str.substring(cut);
        return first + last.toUpperCase();
    }
}

//Given a string, return a new string where the last 3 chars are now in upper case. If the string has
// less than 3 chars, uppercase whatever is there.
// Note that str.toUpperCase() returns the uppercase version of a string.