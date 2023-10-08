package Codebat;
//Given 2 int values, return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.
public class posNeg {

    public static void main(String[] args) {
        int a = -3;
        int b = -1;
        boolean negative = false;
        if((a<0 && b<0 && negative) || (a<0 && b>0 && !negative) ||(a>0 && b<0 && !negative)) {
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }

        }

    }



//posNeg(1, -1, false) → true
//posNeg(-1, 1, false) → true
//posNeg(-4, -5, true) → true