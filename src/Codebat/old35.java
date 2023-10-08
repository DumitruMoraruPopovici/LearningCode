package Codebat;
//old35(3) → true
//old35(10) → true
//old35(15) → false
public class old35 {
    public static void main(String[] args) {
        System.out.println(" The value is:  " + new old35().old35(15) );
    }
    public boolean old35(int n) {
    if(n % 3 == 0 && n % 5 == 0) {
        return false;
    }
    if(n % 3 == 0 || n % 5 == 0) {
        return true;
    }
    return false;
    }
}
//Return true if the given non-negative number is a multiple of 3 or 5, but not both.