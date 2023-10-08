package Codebat;

import java.util.Arrays;

//reverse3([1, 2, 3]) → [3, 2, 1]
//reverse3([5, 11, 9]) → [9, 11, 5]
//reverse3([7, 0, 0]) → [0, 0, 7]
public class reverse3 {
    public static void main(String[] args) {
        System.out.println(" = " + Arrays.toString(new reverse3().reverse3(new int[]{5,11,9})));
    }
    public int[] reverse3(int[] nums) {
    int[] num = new int[nums.length];
    if (nums.length >= 2) {
//        int x = 0;
//        for (int i= 0; i <= nums.length;i++) {
//            num[i] = nums[nums.length-x];
//            x++;
//        }
        num[0] = nums[nums.length-1];
        num[1] = nums[1];
        num[2] = nums[0];
     }
    return num;
    }
}
//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.