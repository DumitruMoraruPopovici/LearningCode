package Codebat;
//intMax(1, 2, 3) → 3
//intMax(1, 3, 2) → 3
//intMax(3, 2, 1) → 3
public class intMax {

    public static void main(String[] args) {
    intMax nums = new intMax();
        System.out.println(nums.intMax(2,1,1));
    }

    public int intMax(int a, int b, int c) {
    if(a > b && a > c){
        return a;
    }
    if(b > a && b > c){
        return b;
    }
    else return c;
    }

}
//   int max;
//
//  // First check between a and b
//  if (a > b) {
//    max = a;
//  } else {
//    max = b;
//  }
//
//  // Now check between max and c
//  if (c > max) {
//    max = c;
//  }
//
//  return max;
//
//  // Could use the built in Math.max(x, y) function which selects the larger
//  // of two values.
//Given three int values, a b c, return the largest.
