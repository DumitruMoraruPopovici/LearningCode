package Codebat;

public class withoutX2 {

    public static void main(String[] args) {
        System.out.println("new string is = " + new withoutX2().withoutX2("x"));
    }

    //withoutX2("xHi") → "Hi"
//withoutX2("Hxi") → "Hi"
//withoutX2("Hi") → "Hi"
    public String withoutX2(String str) {
//        if (str.length() > 0 && str.charAt(0) == 'x') {
//            if (str.charAt(1) == 'x') {
//                return str.substring(2);
//            }
//            return str.substring(1);
//        }
//
//        return str;
        if(str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }
        if (str.length() > 1 && str.charAt(0) == 'x') {
            if (str.charAt(1) == 'x') {
                return str.substring(2);
            }
            return str.substring(1);
        }
        if (str.length() > 0 && str.charAt(0) != 'x') {
            if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
            return str;
        }
        return str;
    }

}


//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
// and otherwise return the string unchanged. This is a little harder than it looks.

//      if (str.length() > 0 && str.charAt(0) == 'x') {
//              if (str.charAt(1) == 'x') {
//              str = str.substring(2);
//              }
//              str = str.substring(1);
//              }
//
//              return str;