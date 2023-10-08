package Codebat;

public class middleThree {

    public static void main(String[] args) {
        System.out.println("The new string is = " + new middleThree().middleThree("and"));

    }
//middleThree("Candy") → "and"
//middleThree("and") → "and"
//middleThree("solving") → "lvi"
    public String middleThree(String str) {
    int cut = str.length()/2;
    return str.substring(cut - 1,cut + 2);
    }
}


//Given a string of odd length, return the string length 3
// from its middle, so "Candy" yields "and". The string length will be at least 3.