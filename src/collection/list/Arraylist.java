package collection.list;

import java.util.*;

//When to Use: Ideal for cases where read operations are more frequent than insertions/deletions at arbitrary positions.
public class Arraylist {
    public static void main(String[] args) {
        //creation ways of arraylist
        ArrayList<Integer> list =new ArrayList<>(10);

        ArrayList<Integer> list2 =new ArrayList<>(Arrays.asList(1,2,3));

        Integer[] arr ={1,2,3};
        List<Integer> list3 =new ArrayList<>(Arrays.asList(arr));

        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,101);

        // get elements
        int a = list.get(0);
        Integer b = list.get(1);

        // remove element
        list.remove(0);
        list.remove(Integer.valueOf(10));
        list.removeAll(List.of(22, 42));

        // contains element
        boolean c = list.contains(1);

        // size
        int d = list.size();

        // set element
        list.set(0, 10);

        // get all elements
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // for each loop
        for(Integer i:list){
            System.out.println(i);
        }

        // arraylist to array
        Integer[] arr1 = list.toArray(new Integer[0]);

        // array to arraylist
        List<Integer> list4 = Arrays.asList(arr1);

//  list.clear();
//  int i = list.lastIndexOf(3);
//  boolean i = list.isEmpty();
//  Object clonee = list.clone();
//        System.out.println(list.equals(list3));

//        Collections.reverse(list);
//        System.out.println(list);

        // sort in ascending order
//        Collections.sort(list);
//        System.out.println(list);

        //sort in descending order
//        Collections.sort(list,Collections.reverseOrder());
//         System.out.println( list);


//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //listIterator will allow us to go forward and backward
//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
        
//        //backward
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }
        //allows modification , add ,remove of elements while traversing
//        while (listIterator.hasNext()) {
//            listIterator.next();
//            listIterator.add(100); //add next to current element
//            listIterator.remove();// remove current element
//        }


        // sorting with comparator
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println(list);

    }
}
