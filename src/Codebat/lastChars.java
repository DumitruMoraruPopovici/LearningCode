package Codebat;

public class lastChars {

    public static void main(String[] args) {
        System.out.println("The new String is = " + new lastChars().lastChars("", ""));
    }
//lastChars("last", "chars") → "ls"
//lastChars("yo", "java") → "ya"
//lastChars("hi", "") → "h@"
    public String lastChars (String a, String b){
//    if(a.length() == 0){
//        return "@" + b.charAt(b.length()-1);
//    }
//    if(b.length() == 0){
//        return a.charAt(0) + "@";
//    }
//
//        return a.charAt(0) + b.substring(b.length()-1);
        if(a.length() >= 1 && b.length() >= 1) {
            return a.charAt(0) + b.substring(b.length()-1);
        }
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        if(a.length() == 0) {
            return "@" + b.charAt(b.length() - 1);
        }
        return a.charAt(0) + "@";
    }
    }

//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
// so "yo" and "java" yields "ya".
// If either string is length 0, use '@' for its missing char.