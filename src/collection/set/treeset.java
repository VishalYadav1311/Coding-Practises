package collection.set;

import java.net.Inet4Address;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {

        //creation ways of tree set
        TreeSet<Integer> ts = new TreeSet<>(); // with comparable --always ascending in case of integer
        // with comparator for descending sorting
        TreeSet<Integer> ts1 = new TreeSet<>(Comparator.reverseOrder());

        // with custom comparator
        Comparator<Integer> descendingComparator = (a, b) -> b - a;
        TreeSet<Integer> ts2 =new TreeSet<>(descendingComparator);

        ts.add(6);
        ts.add(5);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(1); // no insertion of duplicate

        // functions of sortedSet interface
//        Integer s =ts.first(); // returns  first element of set ;
//        ts.last(); // return last element
//        System.out.println(s);

        // headset(x) returns all the elements which are on left side of this x in set (s is not included)
//        SortedSet<Integer> a= ts.headSet(4);
//        SortedSet<Integer> b= ts.tailSet(2); // includes args value and return all element that are right in treeset
//        System.out.println(ts);
//        System.out.println(a);

//        SortedSet<Integer> r=ts.subSet(9,0);
        // note: 4 is left element and 2 must be right element
        System.out.println(ts);
//        System.out.println(r);

//         Integer i = ts.lower(7);  // returns the just left element of set where given no can fit in set according to order
        Integer q = ts.floor(4);  // returns the just right element of set where given no can fit in set according to order
        System.out.println(q);


//        ts.remove(4); //return true or false
//        ts.pollLast(); // return removed element
//        ts.pollFirst(); // return removed element

        //cloning the tree set
//        TreeSet<Integer> cloned = (TreeSet<Integer>) ts.clone();

        //coping comparator of set
//        Comparator<? super Integer> comp=ts.comparator(); //null if its natural comparator

    }
}
