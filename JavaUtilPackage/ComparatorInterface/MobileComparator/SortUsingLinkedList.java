package MobileComparator;
import java.util.TreeSet;

public class SortUsingLinkedList {
    public static void main(String[] args) {
        MobileCompareTo mc1 = new MobileCompareTo(6000, "Nokia");
        MobileCompareTo mc2 = new MobileCompareTo(2000,"Sony");
        MobileCompareTo mc3 = new MobileCompareTo(7000,"Apple");
        TreeSet<MobileCompareTo> al = new TreeSet<MobileCompareTo>();
        al.add(mc1);
        al.add(mc2);
        al.add(mc3);
        for (MobileCompareTo mc : al) {
            System.out.println(mc);
        }
         // Output
        //  Brand : SonyCost : 2000
        //  Brand : NokiaCost : 6000
        //  Brand : AppleCost : 7000
    }
}
