package Codebat;

public class without2 {

    public static void main(String[] args) {
        System.out.println("new string is = " + new without2().without2("x"));
    }
//without2("HelloHe") → "lloHe"
//without2("HelloHi") → "HelloHi"
//without2("Hi") → ""
    public String without2(String str) {
//    String front = str.substring(0,2);
//    String back = str.substring(str.length()-2);
        if(str.length() < 3 && str.length() != 1) {
            return "";
        }
        if(str.length() == 1) {
            return str;
        }
        if(str.substring(0,2).equals(str.substring(str.length()-2))) {
            return str.substring(2);
        }
        return str;
    }
}

//Given a string, if a length 2 substring appears at both its beginning and end,
// return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
// The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.