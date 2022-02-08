package Iterator_Comparator;

import java.util.*;
import java.util.List;

public class ListEnd {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add("asc");
        list.add("asdr");
        list.add("cascw");
        list.add("end");
        list.add("asc");
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("end")) {
                break; //iterator.remove();
            }
            System.out.print(iterator.next());
        }
    }
}
