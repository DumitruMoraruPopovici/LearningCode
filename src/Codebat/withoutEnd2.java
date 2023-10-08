package Codebat;
//withouEnd2("Hello") → "ell"
//withouEnd2("abc") → "b"
//withouEnd2("ab") → ""
public class withoutEnd2 {

    public static void main(String[] args) {
    withoutEnd2 middleword = new withoutEnd2();
        System.out.println(middleword.withouEnd2("Hello"));
    }

    public String withouEnd2(String str) {
        if(str.length() < 3){
            return "";
        }
        return str.substring(1,str.length()-1);
    }
}

//Given a string, return a version without both the first and last char of the string.
// The string may be any length, including 0.