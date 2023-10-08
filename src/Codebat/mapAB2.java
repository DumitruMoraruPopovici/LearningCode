package Codebat;

import java.util.HashMap;
import java.util.Map;

//mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
public class mapAB2 {
    public static void main(String[] args) {
        mapAB2 map1 = new mapAB2();
        Map<String,String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map1.mapAB2(map);
        System.out.println(map);
    }
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
            return map;
        }
        return map;
    }

}
//Modify and return the given map as follows:
// if the keys "a" and "b" are both in the map and have equal values, remove them both.