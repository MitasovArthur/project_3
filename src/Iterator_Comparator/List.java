package Iterator_Comparator;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(7);
        list.add(8);
        list.add(7);
        list.add(25);
        list.add(15);
        list.add(1);
        list.add(0);
        list.add(7);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

    }
}
