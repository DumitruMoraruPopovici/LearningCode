package Codebat;
//less20(18) → true
//less20(19) → true
//less20(20) → false
public class less20 {
    public static void main(String[] args) {
        System.out.println(" The value is " + new less20().less20(19));
    }
    public boolean less20(int n) {
    if(n % 20 == 20 - 1 || n % 20 == 20 -2) {
        return true;
    }
    return false;
    }
}
//Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
// So for example 38 and 39 return true, but 40 returns false