package Codebat;
//everyNth("Miracle", 2) → "Mrce"
//everyNth("abcdefg", 2) → "aceg"
//everyNth("abcdefg", 3) → "adg"
public class everyNth {

    public static void main(String[] args) {
    everyNth word = new everyNth();
        System.out.println(word.everyNth("Miracle",2));
    }

    public String everyNth(String str, int n) {
        String result = "";
        int i = 0;
        while ( i < str.length()){
            result = result + str.charAt(i);
            i = i + n;
        }

        return result;


    }
}


//  String result = "";
//
//  // Look at every nth char
//  for (int i=0; i<str.length(); i = i + n) {
//    result = result + str.charAt(i);
//  }
//  return result;
//}
//Given a non-empty string and an int N, return the string made starting with char 0,
// and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.