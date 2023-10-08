package Codebat;

public class hasBad {

    public static void main(String[] args) {
        System.out.println("This is the string to compare = " + new hasBad().hasBad("badxx"));
    }
//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false
    public boolean hasBad(String str) {
        String toCompare = "bad";
        String toCompareSecond = "";
    if(str.length() < 3)
        {
        return false;

        }
    if(str.length() == 3 && !toCompare.equals(str.substring(0,3))){
        return false;
    }
        return toCompare.equals(str.substring(0,3)) || str.substring(1,4).equals(toCompare);
    }
}

//Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
// such as with "badxxx" or "xbadxx" but not "xxbadxx".
// The string may be any length, including 0. Note: use .equals() to compare 2 strings.

//  if (str.length()>=3 && str.substring(0, 3).equals("bad")) {
//    return true;
//  }
//  if (str.length()>=4 && str.substring(1, 4).equals("bad")) {
//    return true;
//  }
//  return false;