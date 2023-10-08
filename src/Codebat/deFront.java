package Codebat;

public class deFront {

    public static void main(String[] args) {
        System.out.println("new string is = " + new deFront().deFront("Hello"));
    }
//deFront("Hello") → "llo"
//deFront("java") → "va"
//deFront("away") → "aay"

    public String deFront(String str) {
        String firstChar = str.substring(0, 1);
        String secondChar = str.substring(1, 2);
        if (firstChar.equals("a")) {
            if (secondChar.equals("b")) {
                return str;
            }
            return firstChar + str.substring(2);
        }
        if (secondChar.equals("b")) {
            return secondChar + str.substring(2);
        }
        return str.substring(2);
    }
}

//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
// and keep the second char if it is 'b'. The string may be any length. Harder than it looks.