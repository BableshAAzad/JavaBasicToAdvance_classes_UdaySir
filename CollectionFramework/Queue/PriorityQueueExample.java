import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        System.out.println(queue);
        queue.offer(50);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println("-----------------");
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println("-----------------");
        System.out.println(queue.peek());
        System.out.println(queue);
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
    // Ountput :
    // [10, 20, 30, 40]
    // [10, 20, 30, 40, 50]
    // 5
    // -----------------
    // 10
    // [10, 20, 30, 40, 50]
    // -----------------
    // 10
    // [10, 20, 30, 40, 50]
    // -----------------
    // 10
    // [20, 40, 30, 50]
    // -----------------
    // 20
    // [30, 40, 50]
    // -----------------
    // false
    // []
    // true
    // 0
}
