package Codebat;

public class frontBack {

    public static void main(String[] args) {
    frontBack word = new frontBack();
        System.out.println(word.frontBack("code"));

    }

    public String frontBack(String str) {
//    String first = str.substring(0,1);
//    String last = str.substring(str.length() - 1, str.length());
//    String middle = str.substring(1, str.length() - 1);
//    return last + middle + first;
        if(str.length() <= 1)
            return str;
        String mid = str.substring(1,str.length()-1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
}
