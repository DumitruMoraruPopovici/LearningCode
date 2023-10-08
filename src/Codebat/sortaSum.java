package Codebat;
//sortaSum(3, 4) → 7
//sortaSum(9, 4) → 20
//sortaSum(10, 11) → 21
public class sortaSum {

    public static void main(String[] args) {
        System.out.println("The sum is: " + new sortaSum().sortaSum(9,4));
    }

    public int sortaSum(int a, int b) {
    if((a + b <= 19) && (a + b >= 10)) {
        return 20;
    }
    return a +b;
}
}
//codebatsolution
//public int sortaSum(int a, int b) {
//  int sum = a + b;
//  if (sum >= 10 && sum <= 19) {
//    return 20;
//  }
//  return sum;
//
//  // Solution notes: storing a + b in a local variable first cleans
//  // the code up a bit.
//}
//Given 2 ints, a and b, return their sum.
// However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.