package Codebat;

public class conCat {

    public static void main(String[] args) {
        System.out.println("The new String is = " + new conCat().conCat("abc", "cat"));
    }
//conCat("abc", "cat") → "abcat"
//conCat("dog", "cat") → "dogcat"
//conCat("abc", "") → "abc"
    public String conCat(String a, String b) {
//    if(a.charAt(a.length()-1) == b.charAt(0) && (a.length() > = 1 && b.length() >= 1)) {
//        return a + b.substring(1);
//    }
//    if(a.length() == 0){
//        return b;
//    }
//    if(b.length() == 0) {
//        return a;
//    }
//    return a + b;
        if(a.length() >=1 && b.length() >=1) {
            if(a.charAt(a.length()-1) == b.charAt(0)){
                return a + b.substring(1);
            }
            return a + b;
        }
        if(a.length() == 0) {
            return b;
        }
        return a;
    }

}


//Given two strings, append them together (known as "concatenation") and return the result.
// However, if the concatenation creates a double-char,
// then omit one of the chars, so "abc" and "cat" yields "abcat".