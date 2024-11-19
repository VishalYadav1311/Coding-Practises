package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map =new LinkedHashMap<>(16,1,true);
         // put key-value pair

        map.put(1, "value1");
        map.put(2, "value2");
        System.out.println(map);
        map.get(1);
        System.out.println(map);
        // get value by key
        String value = map.get(1); // returns "value1"

        // contains key
        boolean hasKey = map.containsKey(1); // returns true

        // contains value
        boolean hasValue = map.containsValue("value2"); // returns true

        // remove key-value pair
        map.remove(2);

        // get size of map
        int size = map.size(); // returns the number of key-value pairs

        // clear all entries
//        map.clear();

        // iterate through entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // iterate through keys
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // iterate through values
        for (String val : map.values()) {
            System.out.println(val);
        }

        //constructor:-
        //LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder):
        // Creates a LinkedHashMap with specified capacity,
        // load factor, and access order if it is set to true (for access-order instead of insertion-order).

     }
}
