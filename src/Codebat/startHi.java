package Codebat;
//startHi("hi there") → true
//startHi("hi") → true
//startHi("hello hi") → false
public class startHi {
    public static void main(String[] args) {
    startHi word = new startHi();
        System.out.println(word.startHi("h"));
    }

    public boolean startHi(String str) {
        if(str.length()<2) {
            return false;
        }
        String first = str.substring(0,2);

    return first.equals("hi");
    }
}

//Given a string, return true if the string starts with "hi" and false otherwise.
