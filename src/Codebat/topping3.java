package Codebat;

import java.util.HashMap;
import java.util.Map;

//topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
//topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
//topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
public class topping3 {
    public static void main(String[] args) {
        topping3 map1 = new topping3();
        Map<String,String> map = new HashMap<>();
        map.put("potato", "peanuts");
        map.put("salad", "cheese");
        map1.topping3(map);
        System.out.println(map);
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }
        if (map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}
//Given a map of food keys and topping values, modify and return the map as follows:
// if the key "potato" has a value, set that as the value for the key "fries".
// If the key "salad" has a value, set that as the value for the key "spinach".