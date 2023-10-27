package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<sorting_comparable> sc= new ArrayList<>();
        sc.add(new sorting_comparable("Abir",25));
        sc.add(new sorting_comparable("arif",35));
        sc.add(new sorting_comparable("jabir",45));
        sc.add(new sorting_comparable("atik",10));
        sc.add(new sorting_comparable("bahar",15));
       Comparator<sorting_comparable>comp=(o1,o2)->{
         return o1.age>o2.age?1:-1;
       };

        Collections.sort(sc,comp);
        for (sorting_comparable s:
            sc ) {
            System.out.println(s);

        }

    }
}
