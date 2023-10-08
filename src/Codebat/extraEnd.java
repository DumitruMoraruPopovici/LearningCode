package Codebat;
//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"
public class extraEnd {

    public static void main(String[] args) {
    extraEnd word = new extraEnd();
        System.out.println(word.extraEnd("H"));
    }

    public String extraEnd(String str) {
    if(str.length()<2) {
        return "cant compile";
    }
    return str.substring(str.length() -2) + str.substring(str.length()-2) + str.substring(str.length() -2);
    }
}

//Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.