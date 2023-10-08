package Codebat;

public class minCat {

    public static void main(String[] args) {
        System.out.println("The new String is = " + new minCat().minCat("Hello", "Hi"));
    }
//minCat("Hello", "Hi") → "loHi"
//minCat("Hello", "java") → "ellojava"
//minCat("java", "Hello") → "javaello"
    public String minCat(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();
    if(aLength<bLength) {
        return a + b.substring(b.length() - aLength);
    }
    if(aLength>bLength) {
        return a.substring(a.length() - bLength) + b;
    }
    return a + b;
    }
}

//Given two strings, append them together (known as "concatenation") and return the result.
// However, if the strings are different lengths, omit chars from the longer string so it is the
// same length as the shorter string.
// So "Hello" and "Hi" yield "loHi". The strings may be any length.