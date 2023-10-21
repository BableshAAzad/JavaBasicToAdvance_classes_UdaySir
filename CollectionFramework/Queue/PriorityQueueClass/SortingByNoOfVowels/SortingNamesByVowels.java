package PriorityQueueClass.SortingByNoOfVowels;

import java.util.PriorityQueue;

public class SortingNamesByVowels {
    public static void main(String[] args) {
        SortVowelsComparatorC c = new SortVowelsComparatorC();
        PriorityQueue<String> pq = new PriorityQueue<String>(c);
        pq.add("Bablesh");
        pq.add("Dgga");
        pq.add("Kumar");
        pq.add("AAzad");
        pq.add("Durgesh");
        pq.add("Kajol");
        pq.add("Lalita");
        pq.add("Chaturvedani");
        pq.add("Ashawani");
        pq.add("Dgga");
        // for (String s : pq) {
        // System.out.println(s);
        // }
        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }
    }

}
