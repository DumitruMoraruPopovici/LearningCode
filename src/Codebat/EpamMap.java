package Codebat;

import java.util.Map;
import java.util.TreeMap;

public class EpamMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(7,1);
        map.put(0,7);
        map.put(null,0);
        System.out.println(map);
    }

    // A NullPointerException is thrown
}
