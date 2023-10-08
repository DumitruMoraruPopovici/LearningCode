package Codebat;

import java.util.Arrays;
import java.util.List;

public class EpamArrayResult {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        var any = numbers.stream().anyMatch(n ->n%2 ==0);
        System.out.println(any);
    }
    // any is true
}
