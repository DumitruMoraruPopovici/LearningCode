package Codebat;
//more20(20) → false
//more20(21) → true
//more20(22) → true
public class more20 {
    public static void main(String[] args) {
        System.out.println(" The value is " + new more20().more20(22) );
    }
    public boolean more20(int n) {
    if(n % 20 ==1 || n % 20 == 2) {
        return true;
    }
    return false;
    }
}
//Return true if the given non-negative number is 1 or 2 more than a multiple of 20