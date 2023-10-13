import java.util.*;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10);
        System.out.println(hs); // [50, 20, 40, 10, 30]
        Iterator<Integer> i = hs.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " "); // 50 20 40 10 30 
        }
    }
}
