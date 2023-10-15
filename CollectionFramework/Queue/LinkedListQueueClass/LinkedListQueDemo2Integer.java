package LinkedListQueueClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueDemo2Integer {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<Integer>();
        a.add(40);
        a.add(40);
        a.add(30);
        a.add(10);
        a.add(10);
        Iterator<Integer> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(a);
    }
}
