package Codebat;

import org.w3c.dom.ls.LSOutput;

public class factorialRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial (int value) {
        if(value==1) {
            return 1;
        }

        return factorial(value - 1) * value;
    }
}
