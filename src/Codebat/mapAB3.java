package Codebat;

import java.util.HashMap;
import java.util.Map;

//mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
//mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
//mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
public class mapAB3 {
    public static void main(String[] args) {
        mapAB3 map1 = new mapAB3();
        Map<String,String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map1.mapAB3(map);
        System.out.println(map);
    }
    public Map<String, String> mapAB3(Map<String, String> map) {
    if(map.get("a") != null && map.get("b") != null) {
        return map;
    }
        if(map.get("a") != null) {
        map.put("b", map.get("a"));
    }
    if (map.get("b") != null) {
        map.put("a", map.get("b"));
    }
    return map;
    }
}
//Modify and return the given map as follows:
// if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.