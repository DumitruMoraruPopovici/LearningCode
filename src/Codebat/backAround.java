package Codebat;

public class backAround {
    //Given a string, take the last char and return a new string with the
// last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    public static void main(String[] args) {
        backAround word = new backAround();
        System.out.println(word.backAround("a"));

    }

    public String backAround(String str) {
        String last;
        if (str.length() >= 1) {
            last = str.substring((str.length() - 1), str.length()) + str + str.substring((str.length() - 1), str.length());
        } else {
            last = str + str + str;
        }
        return last;
    }
}

//  String last = str.substring(str.length() - 1);
//  return last + str + last;


//backAround("cat") → "tcatt"
//backAround("Hello") → "oHelloo"
//backAround("a") → "aaa"