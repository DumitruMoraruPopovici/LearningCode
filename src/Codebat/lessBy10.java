package Codebat;
//lessBy10(1, 7, 11) → true
//lessBy10(1, 7, 10) → false
//lessBy10(11, 1, 7) → true
public class lessBy10 {
    public static void main(String[] args) {
        System.out.println("args = " + new lessBy10().lessBy10(1,7,11));
    }
    public boolean lessBy10(int a, int b, int c) {
    int f = Math.abs(a-b) ;
    int g = Math.abs(b-c) ;
    int h = Math.abs(a-c) ;
    if (f >= 10 || g >=10 || h >= 10) {
        return true;
    }
    return false;
    }
}
//Given three ints, a b c, return true if one of them is 10 or more less than one of the others.