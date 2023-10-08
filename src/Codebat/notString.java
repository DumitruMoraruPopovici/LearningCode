package Codebat;

public class notString {

    public static void main(String[] args) {
    notString string = new notString();
        System.out.println(string.notString("not candy"));

    }

    public String notString(String str) {
        if(str.length() >=3 && str.substring(0,3).equals("not")) {
            return str;
        }
        return "not " + str;

    }
}


//Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.