package Codebat;
//inOrder(1, 2, 4, false) → true
//inOrder(1, 2, 1, false) → false
//inOrder(1, 1, 2, true) → true
public class inOrder {
    public static void main(String[] args) {
        System.out.println(" the new value is  " + new inOrder().inOrder(1, 2,4, false) );
    }
    public boolean inOrder(int a, int b, int c, boolean bOk) {
    if(bOk && c > b) {
        return true;
    }
    if(b> a && c >b) {
        return true;
    }
    return false;
    }
}
//Given three ints, a b c, return true if b is greater than a, and c is greater than b.
// However, with the exception that if "bOk" is true, b does not need to be greater than a.