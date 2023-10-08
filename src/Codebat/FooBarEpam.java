package Codebat;
class Foo {
    protected int num = 1;

}
interface Bara {
    int num = 2;
}
public class FooBarEpam extends Foo implements Bara {
    public static void main(String[] args) {
        System.out.println("num=" + Bara.num);
    }
}
