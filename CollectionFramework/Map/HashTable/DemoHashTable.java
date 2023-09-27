import java.util.Hashtable;
import java.util.Set;

public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable hm = new Hashtable();
        hm.put(50, "Bablesh");
        hm.put(50, "Kumar"); // instead of "Bablesh", "kumar" is updated
        hm.put(40, "AAzad");
        hm.put(10, "Durgesh");
        // hm.put(null, "Ashwanai"); null value not allowed in key
        System.out.println(hm);
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }
        // output : 
        // {10=Durgesh, 40=AAzad, 50=Kumar}
        // 10 -> Durgesh
        // 40 -> AAzad
        // 50 -> Kumar
    }
}
