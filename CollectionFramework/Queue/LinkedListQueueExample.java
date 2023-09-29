import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        System.out.println(queue);
        queue.offer(10);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println("-----------------");
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println("-----------------");
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("-----------------");
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("-----------------");
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println("-----------------");
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

    }
    /**
     * Output :
     * [40, 10, 30, 20]
     * [40, 10, 30, 20, 10]
     * 5
     * -----------------
     * 40
     * 40
     * -----------------
     * 40
     * 40
     * -----------------
     * 40
     * [10, 30, 20, 10]
     * -----------------
     * 10
     * [30, 20, 10]
     * -----------------
     * false
     * []
     * true
     * 0
     */
}
