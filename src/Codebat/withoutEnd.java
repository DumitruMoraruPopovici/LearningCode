package Codebat;
//withoutEnd("Hello") → "ell"
//withoutEnd("java") → "av"
//withoutEnd("coding") → "odin"
public class withoutEnd {

    public static void main(String[] args) {
    withoutEnd middleword = new withoutEnd();
        System.out.println(middleword.withoutEnd("Hello"));
    }

    public String withoutEnd(String str) {
    if(str.length()<2) {
        return " cant compile";
    }
    return str.substring(1,str.length()-1);
    }
}

//    Given a string, return a version without the first and last char, so "Hello" yields "ell".
//    The string length will be at least 2.
