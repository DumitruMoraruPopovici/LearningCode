package Codebat;

//Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number.
public class nearHundred {

    public static void main(String[] args) {
        int n = 87;
        if((n>90 && n<110) || (n>190 && n<210)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
}


// nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false