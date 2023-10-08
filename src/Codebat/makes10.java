package Codebat;
// Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
public class makes10 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if ((a + b) == 10 || a == 10 || b == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}

//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true