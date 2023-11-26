import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> sv = new Stack<Integer>();
        sv.push(10);
        sv.push(20);
        sv.push(30);
        sv.push(40);
        sv.push(50);
        System.out.println(sv);
        // sv.pop();
        // System.out.println(sv);
        System.out.println(sv.peek());
        // System.out.println(sv.count());
        // System.out.println(change(1));
        Enumeration<Integer> e = sv.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
/**
 * [10, 20, 30, 40, 50]
 * 50
 * 10
 * 20
 * 30
 * 40
 * 50
 */