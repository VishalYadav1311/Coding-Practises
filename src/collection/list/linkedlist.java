package collection.list;

 import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> llist= new LinkedList<>(List.of(1,2,3,4,5));
        System.out.println(llist);

        //add operartions of linkedlist
//        llist.add(6);
//        llist.addFirst(0);
//        llist.offerFirst(5); // return true if insertion is successful
//        llist.offerLast(44);
//        llist.addLast(7);

        //get operations of linkedlist
        int a = llist.get(0);
        Integer b = llist.get(1);

        //remove operations of linkedlist
//        llist.remove(Integer.valueOf(6));
//        llist.remove(0);
//        llist.removeLast();
//       Integer x= llist.removeFirst();// remove first element and reutrn that element and throw error if list is empty
//        llist.removeFirstOccurrence(2);
//        llist.removeAll(List.of(3,4));
//        Integer x=llist.poll(); // return element which is removed
//        llist.pollFirst(); // return null if list is empty

        //examning elements of linkedlist
//       llist.peekLast(); // return null if list is empty other wise last element without removing it

        //contains operations of linkedlist
//        boolean c = llist.contains(1);

        //size operations of linkedlist
//        int d = llist.size();

        //set operations of linkedlist
//        llist.set(0, 100);

        // push , pop , peek operations of linkedlist comes out of deque interface that also used in stack

        //toArray operations of linkedlist
//        Object[] arr = llist.toArray();

        // toArray of specific type
//        Integer[] arr1 = llist.toArray(new Integer[0]);

        // descending iterator of linkedlist used for reverse traversal override from deque interaface
//        Iterator<Integer> itr = llist.descendingIterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        // retainAll operation (only argumented elements will remain and all rest will be removed )
//        llist.retainAll(List.of(1,2,3));

//        replaceall operation
//        llist.replaceAll(x->x*x);


//        sorting of linkedlist
//        llist.sort(null);

    }
}


