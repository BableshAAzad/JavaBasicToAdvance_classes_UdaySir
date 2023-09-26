package MobileComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainMobileClArray {
    public static void main(String[] args) {
        MobileCl mc1 = new MobileCl(3000, "Nokia");
        MobileCl mc2 = new MobileCl(1500, "Samsung");
        MobileCl mc3 = new MobileCl(7000, "Motorola");
        MobileCl mc4 = new MobileCl(1100, "Tyson");
        MobileCl mc5 = new MobileCl(1000, "Apple");
        ArrayList<MobileCl> al = new ArrayList<MobileCl>();
        al.add(mc1);
        al.add(mc2);
        al.add(mc3);
        al.add(mc4);
        al.add(mc5);
        Collections.sort(al);
        for (MobileCl m : al)
            System.out.println(m);
        System.out.println("---------------------------");

        Iterator<MobileCl> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    // Ountpu
    // Brand : Apple Price : 1000
    // Brand : Tyson Price : 1100
    // Brand : Samsung Price : 1500
    // Brand : Nokia Price : 3000
    // Brand : Motorola Price : 7000
    // ---------------------------
    // Brand : Apple Price : 1000
    // Brand : Tyson Price : 1100
    // Brand : Samsung Price : 1500
    // Brand : Nokia Price : 3000
    // Brand : Motorola Price : 7000
}
