package Codebat;
//close10(8, 13) → 8
//        close10(13, 8) → 8
//        close10(13, 7) → 0
public class close10 {

    public static void main(String[] args) {
        close10 nums = new close10();
        System.out.println(nums.close10(6, 14));
    }

    public int close10(int a, int b) {
//    int result = a - b;
//    if (result == 0){
//        return result;
//    }
        if ((a - 10) < (b - 10)) {
            return a;

        }
        if ((b - 10) < (a - 10)) {
            return b;
        }

        return 0;
    }
}

//Given 2 int values, return whichever value is nearest to the value 10,
// or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.