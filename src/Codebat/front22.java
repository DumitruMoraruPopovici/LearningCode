package Codebat;
//front22("kitten") → "kikittenki"
//front22("Ha") → "HaHaHa"
//front22("abc") → "ababcab"
public class front22 {

    public static void main(String[] args) {
        front22 word = new front22();
        System.out.println(word.front22("a"));
    }

    public String front22(String str) {
        int first = 2;
        if (first > str.length()) {
            first = str.length();
        }
        String front = str.substring(0, first);
        return front + str + front;
    }
}

//Given a string, take the first 2 chars and return the string with the 2 chars added at
// both the front and back, so "kitten" yields"kikittenki".
// If the string length is less than 2, use whatever chars are there.