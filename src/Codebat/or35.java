package Codebat;
//or35(3) → true
//or35(10) → true
//or35(8) → false
public class or35 {

    public static void main(String[] args) {
    or35 num = new or35();
        System.out.println(num.or35(10));
    }

    public boolean or35(int n) {
    if((n % 3 == 0) || (n % 5 == 0)){
        return true;
        }
        return false;
    }
}
//return (n % 3 == 0) || (n % 5 == 0);

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator