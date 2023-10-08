package Codebat;

import java.util.HashMap;
import java.util.Map;

//topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
//topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
//topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
public class topping2 {
    public static void main(String[] args) {
        topping2 map1 = new topping2();
        Map<String,String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        map1.topping2(map);
        System.out.println(map);
    }
    public Map<String, String> topping2(Map<String, String> map) {
    if(map.get("ice cream") != null) {
        map.put("yogurt", map.get("ice cream"));
    }
    if(map.get("spinach") != null) {
        map.put("spinach", "nuts");
    }
    return map;
    }
}
//Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value,
// set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".