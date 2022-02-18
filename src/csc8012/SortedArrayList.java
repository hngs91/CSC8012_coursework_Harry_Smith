package csc8012;

import java.util.ArrayList;

public class SortedArrayList<E> extends ArrayList {

    // method and insertion algorithm adapted from here:
    //https://www.youtube.com/watch?v=4P95xpLjbQ4
    public static <E extends Comparable<? super E>> void insert(ArrayList<E> a, E e) {

        // adds object to the array list
        a.add(e);

        for (int i = 0; i < a.size(); i++) {
            E current = a.get(i);

            int index = i;

            while (index > 0 && current.compareTo(a.get(index-1)) < 0) {
                a.set(index, a.get(index-1));
                index--;
            }
            a.set(index, current);
        }
    }
}
