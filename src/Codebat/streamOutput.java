package Codebat;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Stream;

class Foo1{
    protected int num =1;
}
interface Bar{
    int num = 2;
}
public class streamOutput extends Foo1 implements Bar{

    public static final void main(String[] args) throws IOException {
int k=0;
try {
    int i = 5 / k;
}catch (ArithmeticException e) {
    System.out.println("A");
    return;
}catch (RuntimeException e) {
    System.out.println("B");
    return;
}
        }

        static int doIt(int x) {
        return --x;
        }
    }

