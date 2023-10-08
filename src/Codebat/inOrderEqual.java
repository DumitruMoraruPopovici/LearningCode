package Codebat;
//inOrderEqual(2, 5, 11, false) → true
//inOrderEqual(5, 7, 6, false) → false
//inOrderEqual(5, 5, 7, true) → true
public class inOrderEqual {
    public static void main(String[] args) {
        System.out.println("new inOrderEqual() = " + new inOrderEqual().inOrderEqual(5,5,7,false));
    }
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (!equalOk && (a < b) && (b< c)) {
        return true;
    }
    if(equalOk && a <= b && b <= c) {
        return true;
    }
    return false;
    }
}
//Given three ints, a b c, return true if they are in strict increasing order,
// such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
// However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5