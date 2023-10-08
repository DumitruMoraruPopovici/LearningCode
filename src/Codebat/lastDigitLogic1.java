package Codebat;
//lastDigit(23, 19, 13) → true
//lastDigit(23, 19, 12) → false
//lastDigit(23, 19, 3) → true
public class lastDigitLogic1 {
    public static void main(String[] args) {
        System.out.println("new l = " + new lastDigitLogic1().lastDigitLogic1(23,19,12));
    }
    public boolean lastDigitLogic1(int a, int b, int c) {
    int f = a % 10;
    int g = b % 10;
    int h = c % 10;
    if (f == g || g==h || f==h) {
        return true;
    }
    return false;
    }
}
//Given three ints, a b c, return true if two or more of them have the same rightmost digit.
// The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.