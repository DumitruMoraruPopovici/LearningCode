package Codebat;
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false
public class endsLy {

    public static void main(String[] args) {
    endsLy endOfWord = new endsLy();
        System.out.println(endOfWord.endsLy("oddly"));
    }

    public boolean endsLy(String str) {
    if(str.length() < 2) {
        return false;
    }
    return str.substring(str.length()-2).equals("ly");
    }
}

//Given a string, return true if it ends in "ly".