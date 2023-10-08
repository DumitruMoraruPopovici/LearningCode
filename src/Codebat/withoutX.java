package Codebat;

public class withoutX {

    public static void main(String[] args) {
        System.out.println("new string is = " + new withoutX().withoutX("Hix"));
    }
//withoutX("xHix") → "Hi"
//withoutX("xHi") → "Hi"
//withoutX("Hxix") → "Hxi"
    public String withoutX(String str) {
        if(str.length() <1) {
            return "";
        }
    if(str.length() == 1 && str.substring(0).equals("x")) {
        return "";
    }
    if(str.substring(0,1).equals("x")){
        if(str.substring(str.length()-1).equals("x")) {
            return str.substring(1,str.length()-1);
        }
        return str.substring(1);
    }
    if(str.substring(str.length()-1).equals("x")) {
        return str.substring(0,str.length()-1);
    }
    return str;
    }
}

//Given a string, if the first or last chars are 'x',
// return the string without those 'x' chars, and otherwise return the string unchanged.

//  if (str.length() > 0 && str.charAt(0) == 'x') {
//    str = str.substring(1);
//  }
//
//  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
//    str = str.substring(0, str.length()-1);
//  }
//
//  return str;