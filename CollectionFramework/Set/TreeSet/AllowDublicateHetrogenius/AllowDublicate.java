package AllowDublicateHetrogenius;

import java.util.*;

public class AllowDublicate {
    public static void main(String[] args) {
        Comparator<Integer> mySort = (a, b) -> {
            return a < b ? a : b;
        };
        TreeSet<Integer> ts = new TreeSet<>((a, b) -> {
            return a;
        });
        ts.add(4);
        ts.add(3);
        ts.add(1);
        ts.add(5);
        ts.add(4);
        ts.add(2);
        System.out.println(ts);
    }
}
