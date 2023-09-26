package MobileComparable;

import java.util.Iterator;
import java.util.TreeSet;

public class MainMobileTreeSet {
    public static void main(String[] args) {
        MobileCl mc1 = new MobileCl(3000, "Nokia");
        MobileCl mc2 = new MobileCl(1500, "Samsung");
        MobileCl mc3 = new MobileCl(7000, "Motorola");
        MobileCl mc4 = new MobileCl(1100, "Tyson");
        MobileCl mc5 = new MobileCl(1000, "Apple");
        TreeSet<MobileCl> t = new TreeSet<MobileCl>();
        t.add(mc1);
        t.add(mc2);
        t.add(mc3);
        t.add(mc4);
        t.add(mc5);
        for (MobileCl m : t)
            System.out.println(m);
        System.out.println("---------------------------");

        Iterator<MobileCl> i = t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
