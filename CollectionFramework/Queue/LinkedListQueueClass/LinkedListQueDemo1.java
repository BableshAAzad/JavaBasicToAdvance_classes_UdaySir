package LinkedListQueueClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueDemo1 {
    public static void main(String[] args) {
        Queue a = new LinkedList();
        a.add(40);
        a.add("Ba");
        a.add(30);
        a.add(10);
        a.add(10);
        a.add(null);
        a.add(null);
        System.out.println(a);
        Iterator<Object> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
