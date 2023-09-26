package MobileComparator;
import java.util.ArrayList;
import java.util.Collections;

public class SortUsingArrayList {
    public static void main(String[] args) {
        MobileCompareTo mc1 = new MobileCompareTo(6000, "Samsung");
        MobileCompareTo mc2 = new MobileCompareTo(2000, "Motorola");
        MobileCompareTo mc3 = new MobileCompareTo(7000, "SonyErection");
        ArrayList<MobileCompareTo> al = new ArrayList<MobileCompareTo>();
        al.add(mc1);
        al.add(mc2);
        al.add(mc3);
        Collections.sort(al);
        // Internally call compareTo() of mobile class
        for (MobileCompareTo mc : al) {
            System.out.println(mc);
        }
        // Output
        // Brand : MotorolaCost : 2000
        // Brand : SamsungCost : 6000
        // Brand : SonyErectionCost : 7000
    }
}
