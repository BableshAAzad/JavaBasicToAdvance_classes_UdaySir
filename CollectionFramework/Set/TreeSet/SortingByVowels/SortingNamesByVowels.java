package SortingByVowels;

import java.util.TreeSet;

public class SortingNamesByVowels {
    public static void main(String[] args) {
        SortVowelsComparator c = new SortVowelsComparator();
        TreeSet<String> ts = new TreeSet<String>(c);
        ts.add("Bablesh");
        ts.add("Dgga");
        ts.add("Kumar");
        ts.add("AAzad");
        ts.add("Durgesh");
        ts.add("Kajol");
        ts.add("Lalita");
        ts.add("Chaturvedani");
        ts.add("Ashawani");
        ts.add("Dgga");
        System.out.println("Sorting in decending by number of vowevels : ");
        for (String s : ts) {
            System.out.println(s);
        }
    }
}
