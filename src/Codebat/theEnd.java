package Codebat;
//theEnd("Hello", true) → "H"
//theEnd("Hello", false) → "o"
//theEnd("oh", true) → "o"
public class theEnd {

    public static void main(String[] args) {
    theEnd firstOrLast = new theEnd();
    System.out.println (firstOrLast.theEnd("Hello", false));
    }

    public String theEnd(String str, boolean front) {
    if(front){
        return str.substring(0,1);
    }
    return str.substring(str.length()-1);
    }
}

//Given a string, return a string length 1 from its front, unless front is false,
// in which case return a string length 1 from its back. The string will be non-empty.