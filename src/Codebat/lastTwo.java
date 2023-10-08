package Codebat;

public class lastTwo {

    public static void main(String[] args) {
        System.out.println("The new String is = " + new lastTwo().lastTwo("coding"));
    }
//lastTwo("coding") → "codign"
//lastTwo("cat") → "cta"
//lastTwo("ab") → "ba"
    public String lastTwo(String str) {
    if(str.length()<2) {
        return str;
    }
    return str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }
}


//Given a string of any length, return a new string where the last 2 chars, if present,
// are swapped, so "coding" yields "codign".