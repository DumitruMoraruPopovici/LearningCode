package Codebat;

public class CalcCopii {
    public static void main(String[] args) {
        System.out.println(" Suma pe care o doreste Vera este : " + new CalcCopii().Calculator(10,33));
    }

    public int Calculator (int a, int b) {
        int sum = a +b;
        return sum;
    }
}
