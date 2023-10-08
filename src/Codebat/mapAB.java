package Codebat;

import java.util.HashMap;
import java.util.Map;

//mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//mapAB({"a": "Hi"}) → {"a": "Hi"}
//mapAB({"b": "There"}) → {"b": "There"}
public class mapAB {
    public static void main(String[] args) {
    mapAB map1 = new mapAB();
    Map<String,String> map = new HashMap<>();
    map.put("a", "hello");
    map.put("b", "There");
    map1.mapAB(map);
        System.out.println(map);
    }
    public Map<String, String> mapAB(Map<String, String> map) {
    if(map.get("a") != null && map.get("b") != null) {
        map.put("ab", map.get("a") + map.get("b"));
    }
    return map;
    }
}
//Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
// If both keys are present, append their 2 string values together and store the result under the key "ab".