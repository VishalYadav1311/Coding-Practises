package collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>(List.of(1,4,6,33,3,9));
//        ArrayList<String> a =new ArrayList<>(List.of("1","12","3"));
//        LinkedHashSet<String> s =new LinkedHashSet<>(a);
        ls.forEach(a-> System.out.println(a));

// in set u can not access element at given index becuase its unordered but in linkedhash set u can maintain insetion
//        order but still cant use .get(1) like methods like arraylist
    }
}
