package Codebat;
//comboString("Hello", "hi") → "hiHellohi"
//comboString("hi", "Hello") → "hiHellohi"
//comboString("aaa", "b") → "baaab"
public class combString {

    public static void main(String[] args) {
    combString combinedWords = new combString();
        System.out.println(combinedWords.comboString("Hi", "hello"));
    }

    public String comboString(String a, String b) {
        if(a.length() < b.length()){
            return a + b + a;
        }
    return b + a + b;
    }
}

//Given 2 strings, a and b, return a string of the form short+long+short, with the shorter
// string on the outside and the longer string on the inside.
// The strings will not be the same length, but they may be empty (length 0).