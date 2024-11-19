package collection.set;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        // write down all function of hashset with return type explantion as comments
         HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // duplicate value will not be added
        set.add(null); // only one null value allowed to store
        // unorderd collection

        // return true if element is present in set
        boolean a = set.contains(2);
        // return size of set
        int b = set.size();
        // remove element from set
        set.remove(2);

        // return true if set is empty
        boolean c = set.isEmpty();
        // return true if element is present
        boolean d= set.contains(2);
        // clear all elements of set
        set.clear();

        // cloning
//        HashSet<String> clonedSet = (HashSet<String>) set.clone();

        //set.equals(another set) //---- return true if same elements present


        // iterating
        // iterator works
        //foreach
//        set.forEach(ele-> System.out.println(ele));


      }
}
