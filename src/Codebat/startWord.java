package Codebat;

public class startWord {

    public static void main(String[] args) {
        System.out.println("new string is = " + new startWord().startWord("hip", "zip"));
    }
//startWord("hippo", "hi") → "hi"
//startWord("hippo", "xip") → "hip"
//startWord("hippo", "i") → "h"
    public String startWord(String str, String word) {
        if((word.length() < 1) && (str.length() < 1)) {
            return "";
        }
        if (str.length() < word.length()) {
            return "";
        }
        if(str.length() == 1 && word.length() == 1) {
            return str;
        }
        if (word.length() == 1 && str.substring(1,2).equals(word.substring(0))) {
            return str.substring(0,1);
        }
        if(str.length() > 1 && word.length() > 1){
            if(str.substring(1,str.length()).startsWith(word.substring(1,word.length()))){
                return str.charAt(0) + word.substring(1);
            }

//        for (int i = 1; i < word.length(); i++) {
//            String lastWord = "";
//                if (str.substring(i, i + 1).equals(word.substring(i, i + 1))) {
//                   lastWord = lastWord + str.substring(i,i+1);
//
//                }
//            return str.charAt(0) + lastWord;
        }
        return "nothing";
        }
    }




//Given a string and a second "word" string, we'll say that the word matches the string if it appears
// at the front of the string, except its first char does not need to match exactly. On a match, return
// the front of the string, or otherwise return the empty string.
// So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.