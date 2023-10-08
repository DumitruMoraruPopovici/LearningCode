package Codebat;

public class frontAgain {

    public static void main(String[] args) {
        System.out.println("The new = " + new frontAgain().frontAgain("edited"));

    }
//frontAgain("edited") → true
//frontAgain("edit") → false
//frontAgain("ed") → true
    public boolean frontAgain(String str) {
    if(str.length() < 2) {
        return false;
    }
    String toCompare = str.substring(0,1);
    if(str.length() >= 2) {
        return str.substring(str.length()-1).equals(toCompare);
    }
    return false;
    }
}

//  if (str.length() < 2) {
//    return false;  // screen out the short-length case
//  }
//
//  String front = str.substring(0, 2);
//  String back = str.substring(str.length()-2);
//  return(front.equals(back));

//Given a string, return true if the first 2 chars in the string also appear at
// the end of the string, such as with "edited".