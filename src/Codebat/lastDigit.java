package Codebat;
//lastDigit(7, 17) → true
//lastDigit(6, 17) → false
//lastDigit(3, 113) → true
public class lastDigit {

    public static void main(String[] args) {
    lastDigit num = new lastDigit();
        System.out.println(num.lastDigit(7, 17));
    }

    public boolean lastDigit(int a, int b) {
    return (a % 10 == b % 10 );
    }
}

//Given two non-negative int values, return true if they have the same last digit,
// such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
