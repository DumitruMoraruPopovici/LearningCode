package Codebat;
//love6(6, 4) → true
//love6(4, 5) → false
//love6(1, 5) → true
public class love6 {
    public static void main(String[] args) {
    love6 love6 = new love6();
        System.out.println(love6.love6(4,5));
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;

    }
}

//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
// Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.