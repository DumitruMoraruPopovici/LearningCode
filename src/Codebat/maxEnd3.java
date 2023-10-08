package Codebat;

import java.util.Arrays;

//maxEnd3([1, 2, 3]) → [3, 3, 3]
//maxEnd3([11, 5, 9]) → [11, 11, 11]
//maxEnd3([2, 11, 3]) → [3, 3, 3]
public class maxEnd3 {
    public static void main(String[] args) {
        System.out.println(" = " + Arrays.toString(new maxEnd3().maxEnd3(new int[]{11,5,9})));
    }
    public int[] maxEnd3(int[] nums) {
    if (nums.length >=2) {
        if (nums[0] >= nums[nums.length-1]) {
            for (int i =0; i <= nums.length-1; i++) {
                nums[i] = nums[0];
            }
        }
        if (nums[0] <= nums[nums.length-1]) {
            for (int i =0; i <= nums.length-1; i++) {
                nums[i] = nums[nums.length-1];
            }
        }
    }
    return nums;

    }
}
//Given an array of ints length 3, figure out which is larger,
// the first or last element in the array, and set all the other elements to be that value. Return the changed array.