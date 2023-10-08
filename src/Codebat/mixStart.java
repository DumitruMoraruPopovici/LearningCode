package Codebat;
//mixStart("mix snacks") → true
//mixStart("pix snacks") → true
//mixStart("piz snacks") → false
public class mixStart {

    public static void main(String[] args) {
    mixStart word = new mixStart();
        System.out.println(word.mixStart("nix"));
    }

    public boolean mixStart(String str) {
        return ((str.length() > 2) && str.substring(1,3).equals("ix"));


    }
}
//  if (str.length() < 3) return false;
//
//  // Pull out length 2 string for the "ix" part
//  // (i.e. substring starting at index 1 and stopping just before 3).
//  String two = str.substring(1, 3);
//
//  if (two.equals("ix")) {
//    return true;
//  } else {
//    return false;
//  }



//  // This last part can be shortened to just:
//  // return(two.equals("ix"));

//Return true if the given string begins with "mix",
// except the 'm' can be anything, so "pix", "9ix" .. all count.
