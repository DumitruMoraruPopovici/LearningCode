package Codebat;

import java.lang.reflect.Array;
import java.util.Arrays;

//makePi() → [3, 1, 4]
public class makePi {
    public static void main(String[] args) {
      makePi makePi = new makePi();
      int [] num = new int[3];
      num =makePi.makePi();
        System.out.println(num[0] + "" + num[1] + "" + num[2]);
    }
    public int[] makePi() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 4;
        return nums;
    }
}
//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.