package collection.map;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map =new HashMap<>();
        map.put(1, "vishal");
        map.put(2, "yadav");
        map.put(3, "baalwan");

        System.out.println(map);

         //functions of hashmap
        //contains key
        boolean a = map.containsKey(1);
        //contains value
        boolean b = map.containsValue("vishal");
        //get value
        String c = map.get(2);
        //get or default
        String d = map.getOrDefault(5, "Not Found");
//        System.out.println(d);
        //remove
        map.remove(3);
        //replace
        map.replace(2, "yadav", "yadav baalwan");
        //replace all
//        map.replaceAll((k,v)-> k+" "+v);
        //size
        int e = map.size();
        System.out.println(map);
        //clear
//        map.clear();

        // iteration in hashmap

        //keyset
//        int i=0;
//        for(Integer key: map.keySet()){
//            System.out.println(key+" "+map.get(key));
//            map.replaceAll((k,v) -> "dfd"); // replacing all key's values value
//        }
//        System.out.println(map);
//        //entryset
//        for(HashMap.Entry<Integer, String> entry: map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
 //        //values
//        for(String value: map.values()){
//            System.out.println(value);
//        }
//        //foreach
//        map.forEach((k,v)-> System.out.println(k+" "+v));

        //extracting values out of map
//         Collection<String> ss = map.values();//can also typecast into arraylist  --= (ArrayList<String>)map.values();
//        System.out.println(ss);

        // creates key-value pair if key not present
//        String hi = map.putIfAbsent(1, "hi");
//        System.out.println(hi ); // if key is present then returns that keys value
//        System.out.println(map);

        //compute means mapping new value to a key
        map.compute(1,(k,v)-> (v=="vishal")?"okie" :"vishu" );
        // in computing we pass key argument and biFunction i.e lambda function
        // and it updates the value associated with key , works like set in arraylist

        // compute adds key if its not present
        map.compute(9, (key, value)-> value==null ? "ji": null);

        //removing using compute
        map.compute(1, (key,value)->value=="okie"? null :"yes");
        //here at key 1 value is "okie" and we set value null by using lambda function
        //hashmap can contain one null key and multiple null values


//        System.out.println(map);
//        Class<?> aClass = map.getClass();
//        System.out.println(aClass);

        
    }
}
