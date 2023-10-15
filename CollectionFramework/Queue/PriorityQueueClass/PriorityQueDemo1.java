package PriorityQueueClass;

import java.util.Iterator;
import java.util.PriorityQueue;

// Accept only similar type of data 
public class PriorityQueDemo1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add("xa");
        pq.add("ac");
        pq.add("za");
        pq.add("ba");
        pq.add("ba");
        // pq.add(null); null not stored
        System.out.println(pq);
        Iterator<String> i = pq.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
