import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinekedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(80);
		ll.add(10);
		ll.add(90);
		ll.add(40);
		ll.add(30);
		ll.add(15);
        Collections.sort(ll);
        
		Iterator<Integer> i = ll.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------------------");

		ListIterator<Integer> li = ll.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
//		If you print previous() then mindatry print first hashNext()
		System.out.println("-------------------------");
		while(li.hasPrevious()) {
	       System.out.println(li.previous());
		}
	}
}
