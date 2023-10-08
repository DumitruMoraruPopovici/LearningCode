package Codebat;
//middleTwo("string") → "ri"
//middleTwo("code") → "od"
//middleTwo("Practice") → "ct"
public class middleTwo {

    public static void main(String[] args) {
    middleTwo wordWithout2Char = new middleTwo();
        System.out.println(wordWithout2Char.middleTwo("string"));
    }

    public String middleTwo(String str) {
        int cut = str.length() / 2;

    return str.substring(cut - 1,cut) + str.substring(cut , cut + 1);
    }
}

//Given a string of even length, return a string made of the middle two chars, so
// the string "string" yields "ri". The string length will be at least 2.
