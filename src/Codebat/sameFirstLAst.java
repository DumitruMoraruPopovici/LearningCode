package Codebat;
//sameFirstLast([1, 2, 3]) → false
//sameFirstLast([1, 2, 3, 1]) → true
//sameFirstLast([1, 2, 1]) → true
public class sameFirstLAst {
    public static void main(String[] args) {
        System.out.println(" = " + new sameFirstLAst().sameFirstLast(new int[] {1, 2,3,1}));
    }
    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }

        }
        return false;
    }
}
//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.