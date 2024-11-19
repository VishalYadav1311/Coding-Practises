package collection.map;

import java.util.*;

public class treeMap {
    public static void main(String[] args) {
//        TreeMap<Integer, String> tmap= new TreeMap<>(Comparator.reverseOrder());
        TreeMap<Integer, String> tmap= new TreeMap<>(); // natural ordder is ascending order
//        Map<Integer, String> tmap= new LinkedHashMap<>();
//        Map<Integer, String> tmap= new HashMap<>();

        tmap.put(33, "three");
        tmap.put(1, "one");
        tmap.put(53, "five");
        tmap.put(2, "two");
        tmap.put(114, "four");

        Map.Entry<Integer, String> a = tmap.firstEntry();
        Integer i = tmap.firstKey();

        SortedMap<Integer, String> b = tmap.subMap(1, 53);
        System.out.println(b);

        tmap.lastEntry();
        tmap.lastKey();
        Map.Entry<Integer, String> q = tmap.higherEntry(33);// lowerEntry function also exist
        Integer x =tmap.higherKey(33); // lowerKey function also exist
        System.out.println(q);

        SortedMap<Integer,String > p =tmap.tailMap(33); // includes 33 and after that entrySet
        System.out.println(p);
        System.out.println(tmap);

    }
}
