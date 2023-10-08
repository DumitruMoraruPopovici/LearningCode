package Codebat;

import java.util.HashMap;
import java.util.Map;

//mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
public class mapShare {
    public static void main(String[] args) {
    mapShare map1 = new mapShare();
    Map<String, String> map = new HashMap<>();
    map.put("a","aaa");
    map.put("b", "bbb");
    map.put("c", "ccc");
    map1.mapShare(map);
        System.out.println(map);
    }
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.get("c") != null) {
            map.remove("c");
        }
    if(map.get("a") != null ) {
        map.put("b", map.get("a"));
    }
    return map;
    }
}
//Modify and return the given map as follows: if the key "a" has a value,
// set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.