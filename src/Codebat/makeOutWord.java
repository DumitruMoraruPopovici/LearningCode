package Codebat;
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"
public class makeOutWord {

    public static void main(String[] args) {
    makeOutWord word = new makeOutWord();
        System.out.println(word.makeOutWord("<<>>", "Yay"));
    }


    public String makeOutWord(String out, String word) {
    int cut = out.length()/2;
    String first = out.substring(0,cut);
    String last = out.substring(cut);
    return first + word + last;
    }
}

//Given an "out" string length 4, such as "<<>>", and a word, return a new string
// where the word is in the middle of the out string, e.g. "<<word>>".
// Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.