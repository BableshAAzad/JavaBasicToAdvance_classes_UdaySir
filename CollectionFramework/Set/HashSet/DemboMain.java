import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemboMain {
    public static void main(String[] args) {
		Dembo d1 = new Dembo(20);
		Dembo d2 = new Dembo(40);
		Dembo d3 = new Dembo(30);
		Dembo d4 = new Dembo(10);
		Dembo d5 = new Dembo(50);
		HashSet<Dembo> hs = new HashSet<Dembo>();
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		System.out.println(hs);
		TreeSet<Dembo> ts = new TreeSet<Dembo>();
		ts.addAll(hs);
		Iterator<Dembo> i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
