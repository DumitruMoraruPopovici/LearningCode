package Codebat;

public class seeColor {

    public static void main(String[] args) {
        System.out.println("The String has  = " + new seeColor().seeColor("red"));
    }
//seeColor("redxx") → "red"
//seeColor("xxred") → ""
//seeColor("blueTimes") → "blue"
    public String seeColor(String str) {
    if (str.length() < 3) {
        return "nothing";
    }
    if((str.length() >= 3) && (str.substring(0,3).equals("red"))){
        return "red";
    }
    if((str.length() >= 4) && (str.substring(0,4).equals("blue"))) {
        return "blue";
    }
    return "";
    }
}

//Given a string, if the string begins with "red" or "blue" return that color string,
// otherwise return the empty string.