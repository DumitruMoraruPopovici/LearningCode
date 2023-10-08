package Codebat;
//twoAsOne(1, 2, 3) → true
//twoAsOne(3, 1, 2) → true
//twoAsOne(3, 2, 2) → false
public class twoAsOne {
    public static void main(String[] args) {
        System.out.println(" the value is " + new twoAsOne().twoAsOne(1, 2,3));
    }
    public boolean twoAsOne(int a, int b, int c) {
    if((a + b == c) || (a + c == b) || (b + c == a)) {
        return true;

    }
    return false;
    }
}
//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.