import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(40);
        ll.add(10);
        ll.add(50);
        ll.add(20);
        ll.add(30);
        ll.add(80);
      Iterator<Integer> i = ll.iterator();
      while(i.hasNext())
        System.out.println(i.next());
    }
}
