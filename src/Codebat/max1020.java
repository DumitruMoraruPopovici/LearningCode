package Codebat;
//max1020(11, 19) → 19
//max1020(19, 11) → 19
//max1020(11, 9) → 11
public class max1020 {

    public static void main(String[] args) {
    max1020 nums = new max1020();
        System.out.println(nums.max1020(9,21));
    }

    public int max1020(int a, int b) {
//    if((a < 10 || a > 20) && (b < 10 || b > 20)){
//        return 0;
//    }
//    if(a > b){
//        return a;
//    }
//    else
//        return b;
        if(b>a){
            int maxNum = a;
            a = b;
            b = maxNum;
        }
        if(a >= 10 && a <= 20){
            return a;
        }
        if(b >= 10 && b <= 20){
            return b;
        }
        return 0;
    }
}

//Given 2 positive int values, return the larger
// value that is in the range 10..20 inclusive, or return 0 if neither is in that range.