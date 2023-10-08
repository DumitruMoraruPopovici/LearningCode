package Codebat;
//shareDigit(12, 23) → true
//shareDigit(12, 43) → false
//shareDigit(12, 44) → false
public class shareDigit {
    public static void main(String[] args) {
        System.out.println(" Value is " + new shareDigit().shareDigit(12,43));
    }
    public boolean shareDigit(int a, int b) {
    int digit = a/10;
    int digit2 = a%10;
    if(digit == b/10 || digit == b%10) {
        return true;
    }
        if(digit2 == b/10 || digit2 == b%10) {
            return true;
        }
        return false;
    }
}
//Given two ints, each in the range 10..99, return true if there is a digit
// that appears in both numbers, such as the 2 in 12 and 23.
// (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)